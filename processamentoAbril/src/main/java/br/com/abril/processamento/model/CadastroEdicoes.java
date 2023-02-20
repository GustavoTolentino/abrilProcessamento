package br.com.abril.processamento.model;

import java.time.LocalDateTime;

public class CadastroEdicoes {
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
	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDateTime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public LocalDateTime getCompetencia() {
		return competencia;
	}
	public void setCompetencia(LocalDateTime competencia) {
		this.competencia = competencia;
	}
	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public LocalDateTime getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDateTime dataReserva) {
		this.dataReserva = dataReserva;
	}
	public LocalDateTime getDataCancelamento() {
		return dataCancelamento;
	}
	public void setDataCancelamento(LocalDateTime dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	public LocalDateTime getDataCondicional() {
		return dataCondicional;
	}
	public void setDataCondicional(LocalDateTime dataCondicional) {
		this.dataCondicional = dataCondicional;
	}
	private Integer id;
	private String revista;
	private String edicao;
	private String nomeDaEdicao;
	private String frequencia;
	private LocalDateTime dataPublicacao;
	private LocalDateTime dataLancamento;
	private LocalDateTime competencia;
	private LocalDateTime dataAbertura;
	private LocalDateTime dataReserva;
	private LocalDateTime dataCancelamento;
	private LocalDateTime dataCondicional;
}
