package Modelo;
import DAL.PessoaDAO;
import java.util.ArrayList;
import java.util.List;

public class Controle 
{
    private String mensagem;
    
    public void cadastrarPessoa(List<String> dadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosPessoa(dadosPessoa);
        if (validacao.getMensagem().equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.setId(validacao.getId());
            pessoa.setNome(dadosPessoa.get(1));
            pessoa.setRg(dadosPessoa.get(2));
            pessoa.setCpf(dadosPessoa.get(3));
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.cadastrarPessoa(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }
            
    public void editarPessoa(List<String> dadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarDadosPessoa(dadosPessoa);
        if (validacao.getMensagem().equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.setId(validacao.getId());
            pessoa.setNome(dadosPessoa.get(1));
            pessoa.setRg(dadosPessoa.get(2));
            pessoa.setCpf(dadosPessoa.get(3));
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.editarPessoa(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }
            
    public void excluirPessoa(String numeroId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdPessoa(numeroId);
        Pessoa pessoa = new Pessoa();
        if (validacao.getMensagem().equals(""))
        {
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa.setId(validacao.getId());
            pessoaDAO.excluirPessoa(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }
            
    public Pessoa pesquisarPessoaPorId(String numeroId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarIdPessoa(numeroId);
        Pessoa pessoa = new Pessoa();
        if (validacao.getMensagem().equals(""))
        {
            pessoa.setId(validacao.getId());
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa = pessoaDAO.pesquisarPessoaPorId(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
        return pessoa;
    }
            
    public List<Pessoa> pesquisarPessoaPorNome(String nome)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarNomePessoa(nome);
        Pessoa pessoa = new Pessoa();
        List<Pessoa> listaPessoas = new ArrayList<>();
        if (validacao.getMensagem().equals(""))
        {
            pessoa.setNome(nome);
            PessoaDAO pessoaDAO = new PessoaDAO();
            listaPessoas = pessoaDAO.pesquisarPessoaPorNome(pessoa);
            this.mensagem = pessoaDAO.getMensagem();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
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
