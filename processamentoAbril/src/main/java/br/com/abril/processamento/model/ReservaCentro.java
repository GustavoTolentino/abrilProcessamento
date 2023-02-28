package br.com.abril.processamento.model;

import java.util.Date;
public class ReservaCentro {
	public ReservaCentro(Integer id, String centroDeLucro, Integer rateio, Integer reserva, Integer pa,
			Date dataInclusao, Date dataAlteracao, String revista, String origemReceita,
			String edicao, Date competencia, String espacoEFormato, String posicao, String anuncio,
			String tipoDigital, String pagina, String status, String versao, Integer quantidade) {
		super();
		this.id = id;
		this.centroDeLucro = centroDeLucro;
		this.rateio = rateio;
		this.reserva = reserva;
		this.pa = pa;
		this.dataInclusao = dataInclusao;
		this.dataAlteracao = dataAlteracao;
		this.revista = revista;
		this.origemReceita = origemReceita;
		this.edicao = edicao;
		this.competencia = competencia;
		this.espacoEFormato = espacoEFormato;
		this.posicao = posicao;
		this.anuncio = anuncio;
		this.tipoDigital = tipoDigital;
		this.pagina = pagina;
		this.status = status;
		this.versao = versao;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "ReservaCentro [id=" + id + ", centroDeLucro=" + centroDeLucro + ", rateio=" + rateio + ", reserva="
				+ reserva + ", pa=" + pa + ", dataInclusao=" + dataInclusao + ", dataAlteracao=" + dataAlteracao
				+ ", revista=" + revista + ", origemReceita=" + origemReceita + ", edicao=" + edicao + ", competencia="
				+ competencia + ", espacoEFormato=" + espacoEFormato + ", posicao=" + posicao + ", anuncio=" + anuncio
				+ ", tipoDigital=" + tipoDigital + ", pagina=" + pagina + ", status=" + status + ", versao=" + versao
				+ ", quantidade=" + quantidade + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCentroDeLucro() {
		return centroDeLucro;
	}
	public void setCentroDeLucro(String centroDeLucro) {
		this.centroDeLucro = centroDeLucro;
	}
	public Integer getRateio() {
		return rateio;
	}
	public void setRateio(Integer rateio) {
		this.rateio = rateio;
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
	public Date getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}
	public String getOrigemReceita() {
		return origemReceita;
	}
	public void setOrigemReceita(String origemReceita) {
		this.origemReceita = origemReceita;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public Date getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Date competencia) {
		this.competencia = competencia;
	}
	public String getEspacoEFormato() {
		return espacoEFormato;
	}
	public void setEspacoEFormato(String espacoEFormato) {
		this.espacoEFormato = espacoEFormato;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(String anuncio) {
		this.anuncio = anuncio;
	}
	public String getTipoDigital() {
		return tipoDigital;
	}
	public void setTipoDigital(String tipoDigital) {
		this.tipoDigital = tipoDigital;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	private Integer id;
	private String centroDeLucro;
	private Integer rateio;
	private Integer reserva;
	private Integer pa;
	private Date dataInclusao;
	private Date dataAlteracao;
	private String revista;
	private String origemReceita;
	private String edicao;
	private Date competencia;
	private String espacoEFormato;
	private String posicao;
	private String anuncio;
	private String tipoDigital;
	private String pagina;
	private String status;
	private String versao;
	private Integer quantidade;
}
