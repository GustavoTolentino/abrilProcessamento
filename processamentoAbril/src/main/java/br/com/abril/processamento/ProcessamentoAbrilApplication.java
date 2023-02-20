package br.com.abril.processamento;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.abril.processamento.service.ProcessamentoService;

@SpringBootApplication
public class ProcessamentoAbrilApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ProcessamentoAbrilApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		ProcessamentoService srv = new ProcessamentoService();
		srv.processar();
	}
}
