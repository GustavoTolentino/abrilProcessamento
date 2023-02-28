package br.com.abril.processamento.model;

import java.util.Date;

public class Pagamento {
	public Pagamento(Integer id, Integer pa, String prazo, Date vencimento, Integer parcela,
			Date dataInclusao, Date dataAlteracao) {
		super();
		this.id = id;
		this.pa = pa;
		this.prazo = prazo;
		this.vencimento = vencimento;
		this.parcela = parcela;
		this.dataInclusao = dataInclusao;
		this.dataAlteracao = dataAlteracao;
	}
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
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public Integer getParcela() {
		return parcela;
	}
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
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
	private Integer id;
	private Integer pa;
	private String prazo;
	private Date vencimento;
	private Integer parcela;
	private Date dataInclusao;
	private Date dataAlteracao;
}
