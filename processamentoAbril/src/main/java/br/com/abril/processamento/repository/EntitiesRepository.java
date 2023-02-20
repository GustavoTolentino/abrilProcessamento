package br.com.abril.processamento.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import br.com.abril.processamento.model.CadastroIntermediarios;

@Component
@EnableAutoConfiguration
public class EntitiesRepository {
	@Autowired
	private JdbcTemplate template;
	
	public List<CadastroIntermediarios> executeSqlPagamentos(String sql) {
		return template.query(sql, new RowMapper<CadastroIntermediarios>() {
			@Override
			public CadastroIntermediarios mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new CadastroIntermediarios(
						rs.getInt("id"),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString(""),
						rs.getString("")
				);
			}
			
		});
	}
}
