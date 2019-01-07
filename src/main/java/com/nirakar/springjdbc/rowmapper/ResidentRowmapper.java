package com.nirakar.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nirakar.springjdbc.model.Login;

public class ResidentRowmapper implements RowMapper<Login> {

	@Override
	public Login mapRow(ResultSet result, int arg1) throws SQLException {
		Login resident = new Login();
		resident.setUsername(result.getString("username"));
		resident.setPassword(result.getString("password"));
		resident.setDate(result.getDate("date"));
		resident.setId(result.getInt("id"));
		return resident;
	}
}
