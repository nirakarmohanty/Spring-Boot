package com.nirakar.springjdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nirakar.springjdbc.dao.AuthenticateDAO;
import com.nirakar.springjdbc.model.Resident;
import com.nirakar.springjdbc.rowmapper.ResidentRowmapper;
@Component
@Service
public class AuthenticateImpl implements AuthenticateDAO{

	private DataSource dataSource;
	
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
	    return new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public List<Resident> findAll() {
		String sql = "SELECT * FROM LOGIN";
		RowMapper<Resident> rowMapper = new ResidentRowmapper();
		return this.jdbcTemplate().query(sql, rowMapper);
		
		/*String sql = "SELECT * FROM LOGIN";
		List<Resident> residentList = new ArrayList<Resident>();
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
					System.out
						.println(rs.getString("username") + rs.getString("password"));
					}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

*/		//return null;
	}

}
