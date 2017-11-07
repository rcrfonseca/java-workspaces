package uni.jsf.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Livro
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gen_livro")
	@SequenceGenerator(name="gen_livro", sequenceName = "seq_livro")
	private Long		id;

	private String		titulo;
	private String		isbn;
	private String		autor;
	private Float		preco;
	private Integer	estoque;


	public Livro()
	{}


	public Livro(String titulo, String isbn, String autor, Float preco, Integer estoque)
	{
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.preco = preco;
		this.estoque = estoque;
	}


	public Long getId()
	{
		return id;
	}


	public void setId(Long id)
	{
		this.id = id;
	}


	public String getTitulo()
	{
		return titulo;
	}


	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}


	public String getIsbn()
	{
		return isbn;
	}


	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}


	public String getAutor()
	{
		return autor;
	}


	public void setAutor(String autor)
	{
		this.autor = autor;
	}


	public Float getPreco()
	{
		return preco;
	}


	public void setPreco(Float preco)
	{
		this.preco = preco;
	}


	public Integer getEstoque()
	{
		return estoque;
	}


	public void setEstoque(Integer estoque)
	{
		this.estoque = estoque;
	}

}
