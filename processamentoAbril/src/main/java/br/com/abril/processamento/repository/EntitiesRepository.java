package br.com.abril.processamento.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.healthmarketscience.jackcess.expr.NumericConfig;

import br.com.abril.processamento.model.Antecipado;
import br.com.abril.processamento.model.CadastroClientes;
import br.com.abril.processamento.model.CadastroEdicoes;
import br.com.abril.processamento.model.CadastroIntermediarios;
import br.com.abril.processamento.model.Pagamento;
import br.com.abril.processamento.model.ReservaCPC;
import br.com.abril.processamento.model.ReservaCentro;
import br.com.abril.processamento.model.ReservaTerceiros;

@Component
public class EntitiesRepository {

	private Connection jdbcCursor;
	
	public EntitiesRepository() throws SQLException {
		this.jdbcCursor = DriverManager.getConnection("jdbc:ucanaccess:////D:/javaPrograms/abrilProcessamento/SVP_PUBLICIDADE.accdb;openExclusive=false;ignoreCase=true");
	}
	
    public List<CadastroIntermediarios> findAllCadastroIntermediarios() throws SQLException {
    	
    	String sql = "SELECT * FROM fCadastroIntermediarios";  	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<CadastroIntermediarios> listCada = new ArrayList<CadastroIntermediarios>();
		
		while (rs.next()) {
			listCada.add( new CadastroIntermediarios(
					rs.getInt("id"),
					rs.getString("RAZAO SOCIAL"),
					rs.getString("PAPEL"),
					rs.getString("NACIONALIDADE"),
					rs.getString("IDENTIFICACAO"),
					rs.getString("INSCRICAO ESTADUAL"),
					rs.getString("EMAIL"),
					rs.getString("CONTATO"),
					rs.getString("CEP"),
					rs.getString("ENDERECO"),
					rs.getString("CIDADE"),
					rs.getString("UF"),
					rs.getString("PAIS"),
					rs.getString("COMISSAO")));
		}
		return listCada;
    }
    
	public List<Antecipado> findAllAntecipado() throws SQLException {
	    	
	    	String sql = "SELECT * FROM fAntecipados";  	
			Statement staement=  jdbcCursor.createStatement();
			ResultSet rs = staement.executeQuery(sql);
			List<Antecipado> listAntecipa = new ArrayList<Antecipado>();
			
			while (rs.next()) {
				listAntecipa.add( new Antecipado(
						rs.getInt("id"),
						rs.getInt("NUM CONTRATO"),
						rs.getString("EMPRESA"),
						rs.getString("CNPJ ABRIL"),
						rs.getString("CLIENTE"),
						rs.getString("CNPJ CLIENTE"),
						rs.getDate("DATA INICIO"),
						rs.getDate("DATA FIM"),
						rs.getDate("COMPETENCIA"),
						rs.getString("MOEDA"),
						rs.getInt("CAMBIO"),
						rs.getInt("VALOR MOEDA ORIGINAL"),
						rs.getInt("VALOR MOEDA NACIONAL"),
						rs.getString("CREDITO"),
						rs.getString("HISTORICO"),
						rs.getString("FATURA")));
			}
			return listAntecipa;
	    }
	
	public List<CadastroClientes> findAllCadastroClientes() throws SQLException {
    	
    	String sql = "SELECT * FROM fCadastroClientes";  	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<CadastroClientes> listCadastroClientes = new ArrayList<CadastroClientes>();
		
		while (rs.next()) {
			listCadastroClientes.add( new CadastroClientes(
					rs.getInt("id"),
					rs.getString("RAZAO SOCIAL"),
					rs.getString("NACIONALIDADE"),
					rs.getString("IDENTIFICACAO"),
					rs.getString("INSCRICAO ESTADUAL"),
					rs.getString("ORGAO DO GOVERNO"),
					rs.getString("EMAIL"),
					rs.getString("CONTATO"),
					rs.getString("CEP"),
					rs.getString("ENDERECO"),
					rs.getString("CIDADE"),
					rs.getString("UF"),
					rs.getString("PAIS")));
		}
		return listCadastroClientes;
    }
	
	public List<CadastroEdicoes> findAllCadastroEdicoes() throws SQLException {
    	
    	String sql = "SELECT * FROM fCadastroEdicoes";  	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<CadastroEdicoes> listCadastroEdicoes = new ArrayList<CadastroEdicoes>();
		
		while (rs.next()) {
			listCadastroEdicoes.add( new CadastroEdicoes(
					rs.getInt("id"),
					rs.getString("REVISTA"),
					rs.getString("EDICAO"),
					rs.getString("NOME DA EDICAO"),
					rs.getString("FREQUENCIA"),
					rs.getDate("DATA PUBLICACAO"),
					rs.getDate("DATA LANCAMENTO"),
					rs.getDate("COMPETENCIA"),
					rs.getDate("DATA ABERTURA"),
					rs.getDate("DATA RESERVA"),
					rs.getDate("DATA CANCELAMENTO"),
					rs.getDate("DATA CONDICIONAL")));
		}
		return listCadastroEdicoes;
    }
	
	public List<Pagamento> findAllPagamento(String numeroPA) throws SQLException {
    	
    	String sql = "SELECT * FROM fPagamento where PA = " + numeroPA;  	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<Pagamento> listPagamento = new ArrayList<Pagamento>();
		
		while (rs.next()) {
			listPagamento.add( new Pagamento(
					rs.getInt("id"),
					rs.getInt("PA"),
					rs.getString("PRAZO"),
					rs.getDate("VENCIMENTO"),
					rs.getInt("PARCELA"),
					rs.getDate("DATA_INCLUSAO"),
					rs.getDate("DATA_ALTERACAO")));
		}
		return listPagamento;
    }

	public List<ReservaCentro> findAllReservaCentro(String numeroPA) throws SQLException {
    	
    	String sql = "SELECT * FROM fReservasCentros where PA = " + numeroPA;	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<ReservaCentro> listReservaCentro = new ArrayList<ReservaCentro>();
		
		while (rs.next()) {
			listReservaCentro.add( new ReservaCentro(
					rs.getInt("id"),
					rs.getString("CENTRO DE LUCRO"),
					rs.getInt("RATEIO"),
					rs.getInt("RESERVA"),
					rs.getInt("PA"),
					rs.getDate("DATA_INCLUSAO"),
					rs.getDate("DATA_ALTERACAO"),
					rs.getString("REVISTA"),
					rs.getString("ORIGEM RECEITA"),
					rs.getString("EDICAO"),
					rs.getDate("COMPETENCIA"),
					rs.getString("ESPACO E FORMATO"),
					rs.getString("POSICAO"),
					rs.getString("ANUNCIO"),
					rs.getString("TIPO DIGITAL"),
					rs.getString("PAGINA"),
					rs.getString("STATUS"),
					rs.getString("VERSAO"),
					rs.getInt("QUANTIDADE")
					));
		}
		return listReservaCentro;
    }
	
	public List<ReservaCPC> findAllReservaCPC(String numeroPA) throws SQLException {
    	
    	String sql = "SELECT * FROM fReservasCPC where PA = " + numeroPA; 	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<ReservaCPC> listReservaCPC = new ArrayList<ReservaCPC>();
		
		while (rs.next()) {
			listReservaCPC.add( new ReservaCPC(
					rs.getInt("id"),
					rs.getInt("RESERVA"),
					rs.getInt("PA"),
					rs.getString("EMPRESA ABRIL"),
					rs.getString("CNPJ ABRIL"),
					rs.getString("CLIENTE"),
					rs.getString("CNPJ CLIENTE"),
					rs.getString("VERSAO"),
					rs.getString("TIPO DE RECEITA"),
					rs.getString("IND_FATURAMENTO_BRUTO"),
					rs.getString("IND_ANUNCIANTE_FATURADO"),
					rs.getString("MOEDA"),
					rs.getInt("VALOR_BRUTO"),
					rs.getInt("VALOR_LIQUIDO"),
					rs.getInt("VALOR_LIQUIDO_AP_AG"),
					rs.getString("FORMA_PAGAMENTO"),
					rs.getInt("VALOR_FATURA"),
					rs.getInt("CONTRATO"),
					rs.getString("EVENTO"),
					rs.getString("ANALITICA"),
					rs.getString("HISTORICO"),
					rs.getString("PRODUTO"),
					rs.getString("PI"),
					rs.getString("DATA_INCLUSAO"),
					rs.getString("DATA_ALTERAÇÃO"),
					rs.getString("APROVACAO OP"),
					rs.getString("APROVACAO CREDITO")
					));
		}
		return listReservaCPC;
    }
	
public List<ReservaTerceiros> findAllReservaTerceiros() throws SQLException {
    	
    	String sql = "SELECT * FROM fReservaTerceiros";  	
		Statement staement=  jdbcCursor.createStatement();
		ResultSet rs = staement.executeQuery(sql);
		List<ReservaTerceiros> listReservaTerceiros = new ArrayList<ReservaTerceiros>();
		
		while (rs.next()) {
			listReservaTerceiros.add( new ReservaTerceiros(
					rs.getInt("id"),
					rs.getInt("RESERVA"),
					rs.getString("INTERMEDIARIO"),
					rs.getString("CNPJ INTERMEDIARIO"),
					rs.getString("PAPEL"),
					rs.getInt("COMISSAO"),
					rs.getInt("PARTICIPACAO"),
					rs.getDate("DATA_INCLUSAO"),
					rs.getDate("DATA_ALTERACAO"),
					rs.getString("STATUS")
					));
		}
		return listReservaTerceiros;
    }
}
