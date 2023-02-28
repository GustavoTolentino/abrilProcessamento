package br.com.abril.processamento.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.abril.processamento.builder.GeradorColunas;
import br.com.abril.processamento.builder.GeradorLinhas;
import br.com.abril.processamento.builder.LinhaTipo0;
import br.com.abril.processamento.model.Antecipado;
import br.com.abril.processamento.model.CadastroIntermediarios;
import br.com.abril.processamento.model.ReservaCPC;
import br.com.abril.processamento.repository.EntitiesRepository;


@Service
public class ProcessamentoService {
	
	@Autowired
	private EntitiesRepository entitiesRepository;


	public void processar() throws SQLException {
		
		LinhaTipo0 x = LinhaTipo0.builder()
				.tipoRegistro("0")
				.codigoDoEstabelecimentoEmissor("002412")
				.cnpjEstabelecimentoEmissor("123123123123")
				.codigoDoLocal("063363636")
				.tipoDePedido("rapido")
				.numeroDocumentoOrigem("01010101010101")
				.dataGeracao("23/24/2552")
				.nomeDoArquivo("texto.txt")
				.quantidadeDePedidos("25")
				.quantidadeDeRegistros("0")
				.numeroDeSequencia("89")
				.novoNomeDoArquivo("testado.txt")
				.build();
		
		x.processar();
		/*
		 * List<CadastroIntermediarios> list =
		 * entitiesRepository.findAllCadastroIntermediarios();
		 */
		
		// List<CadastroIntermediarios> item = list.stream().filter(c -> c.getId() == 1)
		// .collect(Collectors.toList());

		/*
		 * for (CadastroIntermediarios cadastroIntermediarios : list) {
		 * System.out.println(cadastroIntermediarios); }
		 * 
		 * List<Antecipado> list2 = entitiesRepository.findAllAntecipado();
		 * 
		 * for (Antecipado antecipados : list2) { System.out.println(antecipados); }
		 * 
		 * List<ReservaCPC> list3 = entitiesRepository.findAllReservaCPC("9");
		 * 
		 * for (ReservaCPC reservaCPC : list3) { System.out.println(reservaCPC); }
		 */
	}
}
