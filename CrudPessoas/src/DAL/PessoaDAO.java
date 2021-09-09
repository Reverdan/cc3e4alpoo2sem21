package DAL;

import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                        + "values(?,?,?)";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getRg());
                stmt.setString(3, pessoa.getCpf());
                stmt.execute();
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
        return null;
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
