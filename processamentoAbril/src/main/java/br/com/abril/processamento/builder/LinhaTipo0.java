package br.com.abril.processamento.builder;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class LinhaTipo0 {
	private String tipoRegistro;
	private String codigoDoEstabelecimentoEmissor;
	private String cnpjEstabelecimentoEmissor;
	private String codigoDoLocal;
	private String tipoDePedido;
	private String numeroDocumentoOrigem;
	private String dataGeracao;
	private String nomeDoArquivo;
	private String quantidadeDePedidos;
	private String quantidadeDeRegistros;
	private String numeroDeSequencia;
	private String novoNomeDoArquivo;
	
	public String processar() {
		List<GeradorColunas> listaColunas = new ArrayList<>();
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 1, 1, this.tipoRegistro));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 2, 2, this.codigoDoEstabelecimentoEmissor));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 14, 3, this.cnpjEstabelecimentoEmissor));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 11, 4, this.codigoDoLocal));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 2, 5, this.tipoDePedido));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 8, 6, this.numeroDocumentoOrigem));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 10, 7, this.dataGeracao));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 20, 8, this.nomeDoArquivo));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 14, 9, this.quantidadeDePedidos));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 14, 10, this.quantidadeDeRegistros));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 6, 11, this.numeroDeSequencia));
		listaColunas.add( new GeradorColunas(new String(this.tipoRegistro), 50, 12, this.novoNomeDoArquivo));
		GeradorLinhas geradorLinhas = new GeradorLinhas();
		
		String linha = geradorLinhas.gerarLinhas(listaColunas);
		System.out.println(linha);
		return linha;
	}
}
