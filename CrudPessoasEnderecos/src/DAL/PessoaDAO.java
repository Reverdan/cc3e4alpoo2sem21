package DAL;

import Modelo.Endereco;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO
{

    private String mensagem;
    Conexao conexao = new Conexao();

    public void cadastrarPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "insert into Pessoas (nome, rg, cpf)"
                        + "values(?,?,?)"
                        + "declare @idPessoa int = @@identity "
                        + "select @idPessoa as idPessoa";
                PreparedStatement stmt = con.prepareStatement(comSql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getRg());
                stmt.setString(3, pessoa.getCpf());
                stmt.execute();
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                int id = rs.getInt(1);
                for (Endereco endereco : pessoa.getListaEnderecos())
                {
                    comSql = "insert into enderecos "
                            + "(fk_pessoas_id, logradouro, numero, bairro, cidade) "
                            + "values (?, ?, ?, ?, ?)";
                    stmt = con.prepareStatement(comSql);
                    stmt.setInt(1, id);
                    stmt.setString(2, endereco.getLogradouro());
                    stmt.setString(3, endereco.getNumero());
                    stmt.setString(4, endereco.getBairro());
                    stmt.setString(5, endereco.getCidade());
                    stmt.execute();
                }

                conexao.desconectar();
                this.mensagem = "Pessoa cadastrada com sucesso!";
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void editarPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "update pessoas "
                        + "set nome = ?,"
                        + "rg = ?,"
                        + "cpf = ? "
                        + "where id = ?";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getRg());
                stmt.setString(3, pessoa.getCpf());
                stmt.setInt(4, pessoa.getId());
                stmt.execute();
                conexao.desconectar();
                this.mensagem = "Pessoa editada com sucesso!";
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void excluirPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                pessoa = this.pesquisarPessoaPorId(pessoa);
                if (pessoa.getNome() == null || pessoa.getNome().equals(""))
                {
                    this.mensagem = "Não existe esta pessoa para excluir";
                }
                else
                {
                    String comSql = "delete from pessoas where id = ?";
                    PreparedStatement stmt = con.prepareStatement(comSql);
                    stmt.setInt(1, pessoa.getId());
                    stmt.execute();
                    conexao.desconectar();
                    this.mensagem = "Pessoa excluida com sucesso!";
                }

            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public Pessoa pesquisarPessoaPorId(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "select * from pessoas where id = ?";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setInt(1, pessoa.getId());
                ResultSet resultset = stmt.executeQuery();
                if (resultset.next())
                {
                    pessoa.setNome(resultset.getString("nome"));
                    pessoa.setRg(resultset.getString("rg"));
                    pessoa.setCpf(resultset.getString("cpf"));
                    comSql = "select * from enderecos "
                            + "where fk_pessoas_id = ?";
                    stmt = con.prepareStatement(comSql);
                    stmt.setInt(1, pessoa.getId());
                    resultset = stmt.executeQuery();
                    List<Endereco> listaEnderecos = new ArrayList<>();
                    while (resultset.next())
                    {
                        Endereco end = new Endereco();
                        end.setLogradouro(resultset.getString("logradouro"));
                        end.setNumero(resultset.getString("numero"));
                        end.setBairro(resultset.getString("bairro"));
                        end.setCidade(resultset.getString("cidade"));
                        listaEnderecos.add(end);
                        pessoa.setListaEnderecos(listaEnderecos);
                    }
                }
                else
                {
                    this.mensagem = "Não existe este ID";
                }
                conexao.desconectar();
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de leitura no BD";
        }
        return pessoa;
    }

    public List<Pessoa> pesquisarPessoaPorNome(Pessoa pessoa)
    {
        this.mensagem = "";
        List<Pessoa> listaPessoas = new ArrayList<>();
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "select * from pessoas where nome like ?";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setString(1, pessoa.getNome() + "%");
                ResultSet resultset = stmt.executeQuery();
                while (resultset.next())
                {
                    Pessoa pessoaLista = new Pessoa();
                    pessoaLista.setId(resultset.getInt("id"));
                    pessoaLista.setNome(resultset.getString("nome"));
                    pessoaLista.setRg(resultset.getString("rg"));
                    pessoaLista.setCpf(resultset.getString("cpf"));

                    comSql = "select * from enderecos "
                            + "where fk_pessoas_id = ?";
                    stmt = con.prepareStatement(comSql);
                    stmt.setInt(1, pessoaLista.getId());
                    ResultSet resultsetEnderecos = stmt.executeQuery();
                    List<Endereco> listaEnderecos = new ArrayList<>();
                    while (resultsetEnderecos.next())
                    {
                        Endereco end = new Endereco();
                        end.setLogradouro(resultsetEnderecos.getString("logradouro"));
                        end.setNumero(resultsetEnderecos.getString("numero"));
                        end.setBairro(resultsetEnderecos.getString("bairro"));
                        end.setCidade(resultsetEnderecos.getString("cidade"));
                        listaEnderecos.add(end);
                        pessoaLista.setListaEnderecos(listaEnderecos);
                    }

                    listaPessoas.add(pessoaLista);
                }
                conexao.desconectar();
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de leitura no BD";
        }
        return listaPessoas;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
