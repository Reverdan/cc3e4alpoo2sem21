package Modelo;

import br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException;
import br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.Exception_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import javax.jws.WebService;

@WebService(serviceName = "AtendeClienteService", portName = "AtendeClientePort", endpointInterface = "br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente.wsdl")
public class NewWebServiceFromWSDL 
{

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML> buscaServicosAdicionaisAtivos(java.lang.String usuario, java.lang.String senha) throws SQLException_Exception, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.util.List<java.lang.String> servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String calculaTarifaServico(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double diametro, java.lang.String codMaoPropria, java.lang.Double valorDeclarado, java.lang.String codAvisoRecebimento) throws AutenticacaoException, Exception_Exception, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean verificaSeTodosObjetosCancelados(java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal> arg0) throws SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws Exception_Exception, SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarParametrosPorDescricao(java.lang.String prefix)
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String atualizaPagamentoNaEntrega(java.lang.String usuario, java.lang.String senha) throws SigepClienteException, SQLException_Exception
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public javax.xml.datatype.XMLGregorianCalendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.util.List<java.lang.String> listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.Integer> geraDigitoVerificadorEtiquetas(java.util.List<java.lang.String> etiquetas, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster> obterEmbalagemLRS() throws SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> buscaServicosValorDeclarado(java.lang.String usuario, java.lang.String senha) throws SQLException_Exception, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws SQLException_Exception, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarDimensoesServico(java.lang.String codigo, java.lang.String embalagem)
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem> pesquisarEmbalagensPorServico(java.lang.String codigo)
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String atualizaRemessaAgrupada(java.lang.String usuario, java.lang.String senha) throws SigepClienteException, SQLException_Exception
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String verificaModalTransporte(java.lang.String codigoServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public javax.xml.datatype.XMLGregorianCalendar buscaDataAtual()
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ValePostal buscaTarifaVale(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double valorDeclarado, java.lang.String servicoAdicional) throws Exception_Exception, SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String idCartaoPostagem, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea coleta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal> arg0, java.lang.String arg1) throws SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO> pesquisarServicosAdicionais(java.lang.String codigo)
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> buscaServicosXServicosAdicionais(java.lang.String usuario, java.lang.String senha) throws SigepClienteException, SQLException_Exception
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento cancelarPedidoScol(java.lang.String codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean validarPostagemReversa(java.lang.String codAdministrativo, java.lang.String codigoServico, java.lang.String cepDestinatario, java.lang.String idCartaoPostagem, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa coleta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha, java.lang.String contrato, java.lang.String dataInicio, java.lang.String dataFim, java.lang.String etiqueta) throws SigepClienteException, AutenticacaoException, ErroMontagemRelatorio_Exception
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP> buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO obterMensagemParametrizada(java.lang.Short id)
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String buscaOpcoes(java.util.List<java.lang.String> listaObjetos, java.lang.String tipoResultado, java.lang.String usuario, java.lang.String senha) throws SigepClienteException
    {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
