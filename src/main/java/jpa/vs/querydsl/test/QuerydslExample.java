package jpa.vs.querydsl.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.querydsl.core.types.Projections;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.H2Templates;
import com.querydsl.sql.SQLQuery;

import jpa.vs.querydsl.test.dto.MemberDTO;
import jpa.vs.querydsl.test.querydsl.entity.QMember;

public class QuerydslExample {

	private Configuration config;
	private Connection connection;

	/**
	 * Initialize the connection an the configuration.
	 * 
	 * @throws SQLException
	 */
	public QuerydslExample() throws SQLException {
		config = new Configuration(new H2Templates());
		connection = DriverManager.getConnection("jdbc:h2:mem:/test", "sa", "");
	}

	public List<MemberDTO> getMembers() throws Exception {
		List<MemberDTO> members = new SQLQuery<MemberDTO>(connection, config).select(
				Projections.bean(MemberDTO.class, QMember.member.id.as(MemberDTO.ID), QMember.member.name.as(MemberDTO.NAME)))
				.from(QMember.member).fetch();
		return members;
	}

	/**
	 * Close the connection.
	 * 
	 * @throws SQLException
	 */
	public void close() throws SQLException {
		connection.close();
	}
}
