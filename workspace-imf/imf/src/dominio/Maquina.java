package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Maquina {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_Maquina")
	@SequenceGenerator(name = "gen_Maquina", sequenceName = "seq_Maquina")
	private Long id;

	private String nome;
	private String cpu;
	private String potencia;
	private String ram;
	private String video;
	private String hd;
	private String drive;
	private String placamae;

	public Maquina() {
	}

	public Maquina(Long id, String nome, String cpu, String potencia,
			String ram, String video, String hd, String drive, String placamae) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpu = cpu;
		this.potencia = potencia;
		this.ram = ram;
		this.video = video;
		this.hd = hd;
		this.drive = drive;
		this.placamae = placamae;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getPlacamae() {
		return placamae;
	}

	public void setPlacamae(String placamae) {
		this.placamae = placamae;
	}

}