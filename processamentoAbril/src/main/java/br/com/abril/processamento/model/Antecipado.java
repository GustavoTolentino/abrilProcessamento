package br.com.abril.processamento.model;
import java.util.Date;

public class Antecipado {
	@Override
	public String toString() {
		return "Antecipado [id=" + id + ", numContrato=" + numContrato + ", empresa=" + empresa + ", cnpjAbril="
				+ cnpjAbril + ", cliente=" + cliente + ", cnpjCliente=" + cnpjCliente + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", competencia=" + competencia + ", moeda=" + moeda + ", cambio=" + cambio
				+ ", valorMoedaOriginal=" + valorMoedaOriginal + ", valorMoedaNacional=" + valorMoedaNacional
				+ ", credito=" + credito + ", historico=" + historico + ", fatura=" + fatura + "]";
	}
	public Integer getId() {
		return id;
	}
	public Antecipado(Integer id, Integer numContrato, String empresa, String cnpjAbril, String cliente,
			String cnpjCliente, Date dataInicio, Date dataFim, Date competencia,
			String moeda, Integer cambio, Integer valorMoedaOriginal, Integer valorMoedaNacional, String credito,
			String historico, String fatura) {
		super();
		this.id = id;
		this.numContrato = numContrato;
		this.empresa = empresa;
		this.cnpjAbril = cnpjAbril;
		this.cliente = cliente;
		this.cnpjCliente = cnpjCliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.competencia = competencia;
		this.moeda = moeda;
		this.cambio = cambio;
		this.valorMoedaOriginal = valorMoedaOriginal;
		this.valorMoedaNacional = valorMoedaNacional;
		this.credito = credito;
		this.historico = historico;
		this.fatura = fatura;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumContrato() {
		return numContrato;
	}
	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Date getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Date competencia) {
		this.competencia = competencia;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public Integer getCambio() {
		return cambio;
	}
	public void setCambio(Integer cambio) {
		this.cambio = cambio;
	}
	public Integer getValorMoedaOriginal() {
		return valorMoedaOriginal;
	}
	public void setValorMoedaOriginal(Integer valorMoedaOriginal) {
		this.valorMoedaOriginal = valorMoedaOriginal;
	}
	public Integer getValorMoedaNacional() {
		return valorMoedaNacional;
	}
	public void setValorMoedaNacional(Integer valorMoedaNacional) {
		this.valorMoedaNacional = valorMoedaNacional;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getFatura() {
		return fatura;
	}
	public void setFatura(String fatura) {
		this.fatura = fatura;
	}
	private Integer id;
	private Integer numContrato;
	private String empresa;
	private String cnpjAbril;
	private String cliente;
	private String cnpjCliente;
	private Date dataInicio;
	private Date dataFim;
	private Date competencia;
	private String moeda;
	private Integer cambio;
	private Integer valorMoedaOriginal;
	private Integer valorMoedaNacional;
	private String credito;
	private String historico;
	private String fatura;
}
