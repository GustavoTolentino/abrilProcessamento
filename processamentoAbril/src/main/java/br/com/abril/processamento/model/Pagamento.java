package br.com.abril.processamento.model;

import java.time.LocalDateTime;

public class Pagamento {
	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", pa=" + pa + ", prazo=" + prazo + ", vencimento=" + vencimento + ", parcela="
				+ parcela + ", dataInclusao=" + dataInclusao + ", dataAlteracao=" + dataAlteracao + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPa() {
		return pa;
	}
	public void setPa(Integer pa) {
		this.pa = pa;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	public LocalDateTime getVencimento() {
		return vencimento;
	}
	public void setVencimento(LocalDateTime vencimento) {
		this.vencimento = vencimento;
	}
	public Integer getParcela() {
		return parcela;
	}
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}
	public LocalDateTime getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(LocalDateTime dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	private Integer id;
	private Integer pa;
	private String prazo;
	private LocalDateTime vencimento;
	private Integer parcela;
	private LocalDateTime dataInclusao;
	private LocalDateTime dataAlteracao;
}
