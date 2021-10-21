package DAL;

import Modelo.Endereco;
import Modelo.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class PessoaDAO
{

    private String mensagem;
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void cadastrarPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.save(pessoa);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Pessoa cadastrada com sucesso!";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void editarPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.saveOrUpdate(pessoa);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Pessoa editada com sucesso!";

        }
        catch (Exception e)
        {
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void excluirPessoa(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.delete(pessoa);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Pessoa excluida com sucesso!";

        }
        catch (Exception e)
        {
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public Pessoa pesquisarPessoaPorId(Pessoa pessoa)
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("from Pessoa p where p.id = :id");
            q.setParameter("id", pessoa.getId());
            pessoa = (Pessoa) q.list().get(0);
        }
        catch (Exception e)
        {
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
            Query q = session.createQuery("from Pessoa p where p.nome like :nome");
            q.setParameter("nome", pessoa.getNome() + "%");
            listaPessoas = (List<Pessoa>) q.list();
        }
        catch (Exception e)
        {
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
