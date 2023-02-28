package br.com.abril.processamento.model;

import java.util.Date;

public class ReservaTerceiros {
	public ReservaTerceiros(Integer id, Integer reserva, String intermediario, String cnpjIntermediario, String papel,
			Integer comissao, Integer participacao, Date dataInclusao, Date dataAlteracao,
			String status) {
		super();
		this.id = id;
		this.reserva = reserva;
		this.intermediario = intermediario;
		this.cnpjIntermediario = cnpjIntermediario;
		this.papel = papel;
		this.comissao = comissao;
		this.participacao = participacao;
		this.dataInclusao = dataInclusao;
		this.dataAlteracao = dataAlteracao;
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReservaTerceiros [id=" + id + ", reserva=" + reserva + ", intermediario=" + intermediario
				+ ", cnpjIntermediario=" + cnpjIntermediario + ", papel=" + papel + ", comissao=" + comissao
				+ ", participacao=" + participacao + ", dataInclusao=" + dataInclusao + ", dataAlteracao="
				+ dataAlteracao + ", status=" + status + "]";
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
	public String getIntermediario() {
		return intermediario;
	}
	public void setIntermediario(String intermediario) {
		this.intermediario = intermediario;
	}
	public String getCnpjIntermediario() {
		return cnpjIntermediario;
	}
	public void setCnpjIntermediario(String cnpjIntermediario) {
		this.cnpjIntermediario = cnpjIntermediario;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public Integer getComissao() {
		return comissao;
	}
	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}
	public Integer getParticipacao() {
		return participacao;
	}
	public void setParticipacao(Integer participacao) {
		this.participacao = participacao;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private Integer id;
	private Integer reserva;
	private String intermediario;
	private String cnpjIntermediario;
	private String papel;
	private Integer comissao;
	private Integer participacao;
	private Date dataInclusao;
	private Date dataAlteracao;
	private String status;
}
