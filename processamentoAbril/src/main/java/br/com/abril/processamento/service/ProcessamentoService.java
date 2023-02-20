package br.com.abril.processamento.service;

import org.springframework.stereotype.Service;

import br.com.abril.processamento.repository.EntitiesRepository;

@Service
public class ProcessamentoService {
	private EntitiesRepository entitiesRepository;
	public void processar(){
		entitiesRepository = new EntitiesRepository();
		entitiesRepository.executeSqlPagamentos("SELECT * FROM fCadastroIntermediarios");
	}
}