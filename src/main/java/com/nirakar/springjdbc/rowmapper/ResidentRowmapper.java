package com.nirakar.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nirakar.springjdbc.model.Resident;

public class ResidentRowmapper implements RowMapper<Resident> {

	@Override
	public Resident mapRow(ResultSet result, int arg1) throws SQLException {
		Resident resident = new Resident();
		resident.setUsername(result.getString("username"));
		resident.setPassword(result.getString("password"));
		resident.setDate(result.getDate("date"));
		resident.setId(result.getInt("id"));
		return resident;
	}
}
