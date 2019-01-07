package com.nirakar.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nirakar.springjdbc.model.Flat;

public class FlatMapper implements RowMapper<Flat>  {

	@Override
	public Flat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flat flat = new Flat();
		flat.setFlat(rs.getString("flat"));
		flat.setId(rs.getInt("id"));
		return flat;
	}

}
