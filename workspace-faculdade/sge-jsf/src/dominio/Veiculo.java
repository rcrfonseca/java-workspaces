package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Veiculo
	{

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_Veiculo")
		@SequenceGenerator(name = "gen_Veiculo", sequenceName = "seq_Veiculo")
		private Long id;

		private String modelo;
		private String cor;
		private String placa;

		public Veiculo()
			{
			}

		public Veiculo(String modelo, String cor, String placa)
			{
				super();
				this.modelo = modelo;
				this.cor = cor;
				this.placa = placa;
			}

		public Long getId()
			{
				return id;
			}

		public void setId(Long id)
			{
				this.id = id;
			}

		public String getModelo()
			{
				return modelo;
			}

		public void setModelo(String modelo)
			{
				this.modelo = modelo;
			}

		public String getCor()
			{
				return cor;
			}

		public void setCor(String cor)
			{
				this.cor = cor;
			}

		public String getPlaca()
			{
				return placa;
			}

		public void setPlaca(String placa)
			{
				this.placa = placa;
			}

	}