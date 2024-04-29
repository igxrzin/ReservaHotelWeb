package model;

public class Quarto {
	private int Id;
	private String tipoQuarto;
	private String nomeQuarto;
	private double Preco;
	private String Disponibilidade;
	
	
	public Quarto(int Id, String tipoQuarto, double Preco, String Disponibilidade, String nomeQuarto) {
		this.Id = Id;
		this.tipoQuarto = tipoQuarto;
		this.nomeQuarto = nomeQuarto;
		this.Preco = Preco;
		this.Disponibilidade = "liberado" ;
		}
	
	// GET SET Id
	public int Id() {
		return Id;
	}
	
	public void setId (int Id) {
		this.Id = Id;
	}
	
	// GET SET tipoQuarto
	public String gettipoQuarto() {
		return tipoQuarto;
	}
	
	public void settipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	// GET SET nomeQuarto
	public String getnomeQuarto() {
		return nomeQuarto;
	}
		
	public void setnomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	
	// GET SET Disponibilidade
	public String getDisponibilidade() {
		return Disponibilidade;
	}
	
	public void setDisponibilidade(String Disponibilidade) {
		this.Disponibilidade = Disponibilidade;
	}
	
	// GET SET Preco
	public double Preco() {
		return Preco;
	}
	
	public void setPreco (double Preco) {
		this.Preco = Preco;
	}

	
}