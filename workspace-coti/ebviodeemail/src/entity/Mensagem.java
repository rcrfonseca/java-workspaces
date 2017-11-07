package entity;

public class Mensagem {

	private String remetente;
	
	private String destinatario;
	
	private String assunto;
	
	private String mensagem;

	
	public Mensagem(String remetente, String destinatario, String assunto,
			String mensagem) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}
	public Mensagem() {
		
	}
	
	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
	@Override
	public String toString() {
		return remetente + ", " + destinatario + ", " + assunto + ", " + mensagem;
	}
}
