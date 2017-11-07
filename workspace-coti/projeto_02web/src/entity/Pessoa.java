package entity;

public class Pessoa {

	private Integer idpessoa;
	private String firstname;
	private String lastname;
	private String email;

	public Pessoa(Integer idpessoa, String firstname, String lastname,
			String email) {

		this.idpessoa = idpessoa;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Pessoa() {

	}

	public Integer getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return idpessoa + ", " + firstname + ", " + lastname + ", " + email;
	}

}
