package br.com.abril.processamento.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.abril.processamento.model.CadastroIntermediarios;
import br.com.abril.processamento.repository.EntitiesRepository;


@Service
public class ProcessamentoService {
	
	private EntitiesRepository entitiesRepository;
	
	public ProcessamentoService() throws SQLException {
		this.entitiesRepository = new EntitiesRepository();
	}
	
	public void processar() throws SQLException{
		List<CadastroIntermediarios> list = entitiesRepository.findAllCadastroIntermediarios();
		
		for (CadastroIntermediarios cadastroIntermediarios : list) {
			System.out.println(cadastroIntermediarios);
		}
	}
}
