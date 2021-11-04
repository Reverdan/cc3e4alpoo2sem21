
package ManagedBeans;

import Modelo.Controle;
import Modelo.Pessoa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class bgrPee
{
    private String id;
    private String nome;
    private String rg;
    private String cpf;
    private String mensagem;
    private List<Pessoa> listaPessoas;
    
    public bgrPee()
    {
        
    }
    
    public String pesquisarPorNome()
    {
        Controle controle = new Controle();
        listaPessoas = controle.pesquisarPessoaPorNome(this.nome);
        this.mensagem = controle.getMensagem();
        if (listaPessoas == null || listaPessoas.isEmpty())
        {
            this.mensagem = "Não existe resposta para esta pesquisa";
            return null;
        }
        if (listaPessoas.size() == 1)
        {
            this.id = listaPessoas.get(0).getId().toString();
            this.nome = listaPessoas.get(0).getNome();
            this.rg = listaPessoas.get(0).getRg();
            this.cpf = listaPessoas.get(0).getCpf();
            return null;
        }
        if (listaPessoas.size() > 1)
        {
            return "/paginas/respostaPesquisaPorNome.xhtml";
        }
        return null;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public List<Pessoa> getListaPessoas()
    {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas)
    {
        this.listaPessoas = listaPessoas;
    }
    
    
    
}
