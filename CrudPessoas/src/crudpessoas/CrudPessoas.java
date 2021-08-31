
package crudpessoas;
import DAL.PessoaDAO;
import Modelo.Pessoa;

public class CrudPessoas
{
    public static void main(String[] args)
    {
        PessoaDAO pessoasDao = new PessoaDAO();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao Jose");
        pessoa.setRg("111111111");
        pessoa.setCpf("22222222");
        pessoasDao.cadastrarPessoa(pessoa);
        System.out.println(pessoasDao.getMensagem());
        
    }
    
}
