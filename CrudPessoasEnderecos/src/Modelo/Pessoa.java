package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa 
{
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private List<Enderecos> listaEnderecos = new ArrayList<>();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public List<Enderecos> getListaEnderecos()
    {
        return listaEnderecos;
    }

    public void setListaEnderecos(List<Enderecos> listaEnderecos)
    {
        this.listaEnderecos = listaEnderecos;
    }
    
    
    
}
