package com.nirakar.springjdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nirakar.springjdbc.dao.AuthenticateDAO;
import com.nirakar.springjdbc.model.Login;
import com.nirakar.springjdbc.rowmapper.ResidentRowmapper;
import com.nirakar.springjdbc.util.Query;

@Component
@Service
public class AuthenticateImpl implements AuthenticateDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(this.dataSource);
	}

	@Override
	public List<Login> findAll() {
		RowMapper<Login> rowMapper = new ResidentRowmapper();
		return this.jdbcTemplate().query(Query.SELECT_ALL_LOGIN, rowMapper);

	}

	@Override
	public Login getResident(String username) {

		RowMapper<Login> rowMapper = new BeanPropertyRowMapper<Login>(
				Login.class);
		Login resident = jdbcTemplate().queryForObject(
				Query.SELECT_USERNAME_LOGIN, rowMapper, username);
		return resident;
	}

	@Override
	public boolean isValidUser(String username) {
		Login resident = getResident(username);

		if (!StringUtils.isEmpty(resident)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updatePassword(String username, String password) {

		int result = jdbcTemplate().update(Query.UPDATE_PASSWORD_LOGIN,
				password, username);
		return result > 0 ? true : false;

	}

	@Override
	public boolean insertNewUser(Login loginDetails) {
	int result=	jdbcTemplate().update(Query.INSERT_NEW_USER_LOGIN,
				loginDetails.getUsername(), loginDetails.getPassword(),
				loginDetails.getDate());
	return result > 0 ? true : false;
	}

}
