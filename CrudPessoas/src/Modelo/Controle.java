package Modelo;
import DAL.PessoaDAO;
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
        
    }
            
    public void excluirPessoa(String numeroId)
    {
        
    }
            
    public Pessoa pesquisarPessoaPorId(String numeroId)
    {
        return null;
    }
            
    public List<Pessoa> pesquisarPessoaPorNome(String nome)
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
