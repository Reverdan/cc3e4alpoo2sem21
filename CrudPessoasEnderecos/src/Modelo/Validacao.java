package Modelo;

import java.util.List;

public class Validacao 
{
    private String mensagem;
    private Integer id;
    
    public void validarDadosPessoa(List<String> dadosPessoa)
    {
        this.mensagem = "";
        this.validarIdPessoa(dadosPessoa.get(0)); //ID
        this.validarNomePessoa(dadosPessoa.get(1)); //Nome
        if (dadosPessoa.get(2).length() < 9) //Rg
            this.mensagem += "RG inválido \n";
        if (dadosPessoa.get(3).length() < 11) //Cpf
            this.mensagem += "CPF inválido \n";
    }
    
    public void validarIdPessoa(String numeroId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.parseInt(numeroId); //ID
        }
        catch (Exception e)
        {
            this.mensagem += "ID inválido \n";
        }
    }
    
    public void validarNomePessoa(String nome)
    {
        this.mensagem = "";
        if (nome.length() < 3 ||
                nome.length() > 50) //Nome
        {
            this.mensagem += "Nome deve ter de 3 a 50 caracteres \n";
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Integer getId()
    {
        return id;
    }
    
    
    
}
