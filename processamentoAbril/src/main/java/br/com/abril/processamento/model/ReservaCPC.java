package br.com.abril.processamento.model;

public class ReservaCPC {
	public ReservaCPC(Integer id, Integer reserva, Integer pa, String empresaAbril, String cnpjAbril, String cliente,
			String cnpjCliente, String versao, String tipoDeReceita, String indFaturamentoBruto,
			String indAnuncianteFaturado, String moeda, Integer valorBruto, Integer valorLiquido,
			Integer valorLiquidoAPAG, String formaPagamento, Integer valorFatura, Integer contrato, String evento,
			String analitica, String historico, String produto, String pi, String dataInclusao, String dataAlteracao,
			String aprovacaoOP, String aprovacaoCredito) {
		super();
		this.id = id;
		this.reserva = reserva;
		this.pa = pa;
		this.empresaAbril = empresaAbril;
		this.cnpjAbril = cnpjAbril;
		this.cliente = cliente;
		this.cnpjCliente = cnpjCliente;
		this.versao = versao;
		this.tipoDeReceita = tipoDeReceita;
		this.indFaturamentoBruto = indFaturamentoBruto;
		this.indAnuncianteFaturado = indAnuncianteFaturado;
		this.moeda = moeda;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.valorLiquidoAPAG = valorLiquidoAPAG;
		this.formaPagamento = formaPagamento;
		this.valorFatura = valorFatura;
		this.contrato = contrato;
		this.evento = evento;
		this.analitica = analitica;
		this.historico = historico;
		this.produto = produto;
		this.pi = pi;
		this.dataInclusao = dataInclusao;
		this.dataAlteracao = dataAlteracao;
		this.aprovacaoOP = aprovacaoOP;
		this.aprovacaoCredito = aprovacaoCredito;
	}
	@Override
	public String toString() {
		return "ReservaCPC [id=" + id + ", reserva=" + reserva + ", pa=" + pa + ", empresaAbril=" + empresaAbril
				+ ", cnpjAbril=" + cnpjAbril + ", cliente=" + cliente + ", cnpjCliente=" + cnpjCliente + ", versao="
				+ versao + ", tipoDeReceita=" + tipoDeReceita + ", indFaturamentoBruto=" + indFaturamentoBruto
				+ ", indAnuncianteFaturado=" + indAnuncianteFaturado + ", moeda=" + moeda + ", valorBruto=" + valorBruto
				+ ", valorLiquido=" + valorLiquido + ", valorLiquidoAPAG=" + valorLiquidoAPAG + ", formaPagamento="
				+ formaPagamento + ", valorFatura=" + valorFatura + ", contrato=" + contrato + ", evento=" + evento
				+ ", analitica=" + analitica + ", historico=" + historico + ", produto=" + produto + ", pi=" + pi
				+ ", dataInclusao=" + dataInclusao + ", dataAlteracao=" + dataAlteracao + ", aprovacaoOP=" + aprovacaoOP
				+ ", aprovacaoCredito=" + aprovacaoCredito + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getReserva() {
		return reserva;
	}
	public void setReserva(Integer reserva) {
		this.reserva = reserva;
	}
	public Integer getPa() {
		return pa;
	}
	public void setPa(Integer pa) {
		this.pa = pa;
	}
	public String getEmpresaAbril() {
		return empresaAbril;
	}
	public void setEmpresaAbril(String empresaAbril) {
		this.empresaAbril = empresaAbril;
	}
	public String getCnpjAbril() {
		return cnpjAbril;
	}
	public void setCnpjAbril(String cnpjAbril) {
		this.cnpjAbril = cnpjAbril;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCnpjCliente() {
		return cnpjCliente;
	}
	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getTipoDeReceita() {
		return tipoDeReceita;
	}
	public void setTipoDeReceita(String tipoDeReceita) {
		this.tipoDeReceita = tipoDeReceita;
	}
	public String getIndFaturamentoBruto() {
		return indFaturamentoBruto;
	}
	public void setIndFaturamentoBruto(String indFaturamentoBruto) {
		this.indFaturamentoBruto = indFaturamentoBruto;
	}
	public String getIndAnuncianteFaturado() {
		return indAnuncianteFaturado;
	}
	public void setIndAnuncianteFaturado(String indAnuncianteFaturado) {
		this.indAnuncianteFaturado = indAnuncianteFaturado;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public Integer getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(Integer valorBruto) {
		this.valorBruto = valorBruto;
	}
	public Integer getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(Integer valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	public Integer getValorLiquidoAPAG() {
		return valorLiquidoAPAG;
	}
	public void setValorLiquidoAPAG(Integer valorLiquidoAPAG) {
		this.valorLiquidoAPAG = valorLiquidoAPAG;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Integer getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(Integer valorFatura) {
		this.valorFatura = valorFatura;
	}
	public Integer getContrato() {
		return contrato;
	}
	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getAnalitica() {
		return analitica;
	}
	public void setAnalitica(String analitica) {
		this.analitica = analitica;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getPi() {
		return pi;
	}
	public void setPi(String pi) {
		this.pi = pi;
	}
	public String getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public String getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(String dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public String getAprovacaoOP() {
		return aprovacaoOP;
	}
	public void setAprovacaoOP(String aprovacaoOP) {
		this.aprovacaoOP = aprovacaoOP;
	}
	public String getAprovacaoCredito() {
		return aprovacaoCredito;
	}
	public void setAprovacaoCredito(String aprovacaoCredito) {
		this.aprovacaoCredito = aprovacaoCredito;
	}
	private Integer id;
	private Integer reserva;
	private Integer pa;
	private String empresaAbril;
	private String cnpjAbril;
	private String cliente;
	private String cnpjCliente;
	private String versao;
	private String tipoDeReceita;
	private String indFaturamentoBruto;
	private String indAnuncianteFaturado;
	private String moeda;
	private Integer valorBruto;
	private Integer valorLiquido;
	private Integer valorLiquidoAPAG;
	private String formaPagamento;
	private Integer valorFatura;
	private Integer contrato;
	private String evento;
	private String analitica;
	private String historico;
	private String produto;
	private String pi;
	private String dataInclusao;
	private String dataAlteracao;
	private String aprovacaoOP;
	private String aprovacaoCredito;
}	
