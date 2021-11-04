package ManagedBeans;

import Modelo.Controle;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class bgrCadastro
{
    private String nome;
    private String rg;
    private String cpf;
    private String mensagem;
    
    public bgrCadastro()
    {
    }
    
    public String cadastrar()
    {
        this.mensagem = "";
        List<String> listadadosPessoa = new ArrayList<>();
        listadadosPessoa.add("0");
        listadadosPessoa.add(this.nome);
        listadadosPessoa.add(this.rg);
        listadadosPessoa.add(this.cpf);
//        List<String> listaDadosEnderecos = new ArrayList<>();
        List<List<String>> listaStringEnderecos = new ArrayList<>();
        Controle controle = new Controle();
        controle.cadastrarPessoa(listadadosPessoa, listaStringEnderecos);
        this.mensagem = controle.getMensagem();
        return "/paginas/respostacadastro.xhtml";
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
    
    
    
}
