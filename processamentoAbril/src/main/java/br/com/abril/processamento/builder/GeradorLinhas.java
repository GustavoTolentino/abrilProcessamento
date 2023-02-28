package br.com.abril.processamento.builder;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GeradorLinhas {
	public String gerarLinhas(List<GeradorColunas> listaColunas) {
        String retorno = "";

        listaColunas.sort(Comparator.comparingInt(GeradorColunas::getNumeroPosicao));

        for (GeradorColunas coluna : listaColunas) {
            retorno += coluna.getValor();
        }

        return retorno;
    }
}