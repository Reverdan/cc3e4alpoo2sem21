package DAL;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        catch (Exception e)
        {
            this.mensagem = e.getMessage();
        }
    }
            
    public void editarPessoa(Pessoa pessoa)
    {
        
    }
            
    public void excluirPessoa(Pessoa pessoa)
    {
        
    }
            
    public Pessoa pesquisarPessoaPorId(Pessoa pessoa)
    {
        return null;
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
