package com.nirakar.springjdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nirakar.springjdbc.dao.FlatDAO;
import com.nirakar.springjdbc.model.Flat;
import com.nirakar.springjdbc.rowmapper.FlatMapper;
import com.nirakar.springjdbc.util.Query;

public class FlatImpl implements FlatDAO{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(this.dataSource);
	}

	
	@Override
	public List<Flat> getAllFlatName() {
		RowMapper<Flat> flatRowmapper = new FlatMapper();
		List<Flat> flatList = jdbcTemplate().query(Query.SELECT_ALL_FLAT,flatRowmapper);
		return flatList;
	}

}
