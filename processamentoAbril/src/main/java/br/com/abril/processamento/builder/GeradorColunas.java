package br.com.abril.processamento.builder;

import org.apache.commons.lang3.StringUtils;

public class GeradorColunas{
	
	public GeradorColunas(String tipoLinha, Integer tamanhoString, Integer numeroPosicao, String valor) {
		super();
		this.tipoLinha = tipoLinha;
		this.tamanhoString = tamanhoString;
		this.numeroPosicao = numeroPosicao;
		valor = valor + StringUtils.rightPad(" ", tamanhoString);
		this.valor = valor.substring(0, tamanhoString);
	}

	private String tipoLinha;
	
	private Integer tamanhoString;
	
	private Integer numeroPosicao;
	
	private String valor;

	public String getTipoLinha() {
		return tipoLinha;
	}

	public void setTipoLinha(String tipoLinha) {
		this.tipoLinha = tipoLinha;
	}

	public Integer getTamanhoString() {
		return tamanhoString;
	}

	public void setTamanhoString(Integer tamanhoString) {
		this.tamanhoString = tamanhoString;
	}

	public Integer getNumeroPosicao() {
		return numeroPosicao;
	}

	public void setNumeroPosicao(Integer numeroPosicao) {
		this.numeroPosicao = numeroPosicao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "GeradorLinha [tipoLinha=" + tipoLinha + ", tamanhoString=" + tamanhoString + ", numeroPosicao="
				+ numeroPosicao + ", valor=" + valor + "]";
	}
	public String gerarColuna() {
	    return StringUtils.rightPad(valor, tamanhoString);
	}
	
	
}
