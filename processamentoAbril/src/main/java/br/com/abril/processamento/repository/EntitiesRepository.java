package br.com.abril.processamento.repository;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import br.com.abril.processamento.model.CadastroIntermediarios;

@Service
public class EntitiesRepository {

	private Connection jdbcCursor;
	
	public EntitiesRepository() throws SQLException {
		this.jdbcCursor = DriverManager.getConnection("jdbc:ucanaccess:////D:/Java/eLarning/AbrilDB/SVP_PUBLICIDADE.accdb;openExclusive=false;ignoreCase=true");
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
}
