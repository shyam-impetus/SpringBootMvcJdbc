package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.EProduct;

@Repository
public class EProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<EProduct> getProducts() {
		
		return jdbcTemplate.query("select * from eproduct_11142021", new RowMapper<EProduct>() {

			@Override
			public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProduct e = new EProduct();
				e.setEproduct_id(rs.getInt(1));
				e.setEproduct_name(rs.getString(2));
				e.setEproduct_price(rs.getDouble(3));
				return e;
			}
			
		});
		
	}

}
