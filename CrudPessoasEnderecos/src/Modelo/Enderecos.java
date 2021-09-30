package Modelo;

public class Enderecos 
{
    private int id;
    private int fk_pessoas_id;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getFk_pessoas_id()
    {
        return fk_pessoas_id;
    }

    public void setFk_pessoas_id(int fk_pessoas_id)
    {
        this.fk_pessoas_id = fk_pessoas_id;
    }

    public String getLogradouro()
    {
        return logradouro;
    }

    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public String getBairro()
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    
    
}
