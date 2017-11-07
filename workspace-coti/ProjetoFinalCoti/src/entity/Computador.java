package entity;

public class Computador {
	
	private String nome;
	private String cpu;
	private Integer ram;
	private String video;
	private String drivemidia;
	private String hd;
	private String placamae;
	private String monitor;
	private String so;
	
	public Computador() {
	}

	public Computador(String nome, String cpu, Integer ram, String video,
			String drivemidia, String hd, String placamae, String monitor,
			String so) {
		this.nome = nome;
		this.cpu = cpu;
		this.ram = ram;
		this.video = video;
		this.drivemidia = drivemidia;
		this.hd = hd;
		this.placamae = placamae;
		this.monitor = monitor;
		this.so = so;
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

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getDrivemidia() {
		return drivemidia;
	}

	public void setDrivemidia(String drivemidia) {
		this.drivemidia = drivemidia;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getPlacamae() {
		return placamae;
	}

	public void setPlacamae(String placamae) {
		this.placamae = placamae;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String toString() {
		return "Computador: " + nome + ", CPU = " + cpu + ", RAM = " + ram
				+ ", Placa de Video = " + video + ", Drive Mídia = " + drivemidia + ", hd = "
				+ hd + ", Placa-Mãe = " + placamae + ", Monitor = " + monitor
				+ ", Sistema Operacional = " + so;
	}
}