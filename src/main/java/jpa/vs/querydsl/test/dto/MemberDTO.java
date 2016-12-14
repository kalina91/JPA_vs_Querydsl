package jpa.vs.querydsl.test.dto;

public class MemberDTO {
	
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String EMAIL = "email";
	
	
	private int id;

	private  String name;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
