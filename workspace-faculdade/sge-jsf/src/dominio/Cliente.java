package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente
	{

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_Cliente")
		@SequenceGenerator(name = "gen_Cliente", sequenceName = "seq_Cliente")
		private Long id;

		private String nome;
		private String cpf;
		private String logradouro;
		private String numero;
		private String complemento;
		private String uf;
		private String bairro;
		private String cidade;
		private String situacao;

		public Cliente()
			{
			}

		public Cliente(Long id, String nome, String cpf, String logradouro,
				String numero, String complemento, String uf, String bairro,
				String cidade, String situacao)
			{
				super();
				this.id = id;
				this.nome = nome;
				this.cpf = cpf;
				this.logradouro = logradouro;
				this.numero = numero;
				this.complemento = complemento;
				this.uf = uf;
				this.bairro = bairro;
				this.cidade = cidade;
				this.situacao = situacao;
			}

		public Long getId()
			{
				return id;
			}

		public void setId(Long id)
			{
				this.id = id;
			}

		public String getNome()
			{
				return nome;
			}

		public void setNome(String nome)
			{
				this.nome = nome;
			}

		public String getCpf()
			{
				return cpf;
			}

		public void setCpf(String cpf)
			{
				this.cpf = cpf;
			}

		public String getLogradouro()
			{
				return logradouro;
			}

		public void setLogradouro(String logradouro)
			{
				this.logradouro = logradouro;
			}

		public String getNumero()
			{
				return numero;
			}

		public void setNumero(String numero)
			{
				this.numero = numero;
			}

		public String getComplemento()
			{
				return complemento;
			}

		public void setComplemento(String complemento)
			{
				this.complemento = complemento;
			}

		public String getUf()
			{
				return uf;
			}

		public void setUf(String uf)
			{
				this.uf = uf;
			}

		public String getBairro()
			{
				return bairro;
			}

		public void setBairro(String bairro)
			{
				this.bairro = bairro;
			}

		public String getCidade()
			{
				return cidade;
			}

		public void setCidade(String cidade)
			{
				this.cidade = cidade;
			}

		public String getSituacao()
			{
				return situacao;
			}

		public void setSituacao(String situacao)
			{
				this.situacao = situacao;
			}

		

	}
