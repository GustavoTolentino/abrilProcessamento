package br.com.abril.processamento.model;

import java.util.Date;

public class CadastroEdicoes {
	public CadastroEdicoes(Integer id, String revista, String edicao, String nomeDaEdicao, String frequencia,
			Date dataPublicacao, Date dataLancamento, Date competencia,
			Date dataAbertura, Date dataReserva, Date dataCancelamento,
			Date dataCondicional) {
		super();
		this.id = id;
		this.revista = revista;
		this.edicao = edicao;
		this.nomeDaEdicao = nomeDaEdicao;
		this.frequencia = frequencia;
		this.dataPublicacao = dataPublicacao;
		this.dataLancamento = dataLancamento;
		this.competencia = competencia;
		this.dataAbertura = dataAbertura;
		this.dataReserva = dataReserva;
		this.dataCancelamento = dataCancelamento;
		this.dataCondicional = dataCondicional;
	}
	@Override
	public String toString() {
		return "CadastroEdicoes [id=" + id + ", revista=" + revista + ", edicao=" + edicao + ", nomeDaEdicao="
				+ nomeDaEdicao + ", frequencia=" + frequencia + ", dataPublicacao=" + dataPublicacao
				+ ", dataLancamento=" + dataLancamento + ", competencia=" + competencia + ", dataAbertura="
				+ dataAbertura + ", dataReserva=" + dataReserva + ", dataCancelamento=" + dataCancelamento
				+ ", dataCondicional=" + dataCondicional + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getNomeDaEdicao() {
		return nomeDaEdicao;
	}
	public void setNomeDaEdicao(String nomeDaEdicao) {
		this.nomeDaEdicao = nomeDaEdicao;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Date getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Date competencia) {
		this.competencia = competencia;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getDataCancelamento() {
		return dataCancelamento;
	}
	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	public Date getDataCondicional() {
		return dataCondicional;
	}
	public void setDataCondicional(Date dataCondicional) {
		this.dataCondicional = dataCondicional;
	}
	private Integer id;
	private String revista;
	private String edicao;
	private String nomeDaEdicao;
	private String frequencia;
	private Date dataPublicacao;
	private Date dataLancamento;
	private Date competencia;
	private Date dataAbertura;
	private Date dataReserva;
	private Date dataCancelamento;
	private Date dataCondicional;
}
