package model;

public class Quarto {
	public int Id;
	public String tipoQuarto;
	public double Preco;
	public String Disponibilidade;
	
	
	public Quarto(int Id, String tipoQuarto, double Preco, String Disponibilidade ) {
		this.Id = 0;
		this.tipoQuarto = tipoQuarto;
		this.Preco = 0;
		this.Disponibilidade = Disponibilidade;
		}
	
	public String getDisponibilidade() {
		return Disponibilidade;
	}
	
	public void setDisponibilidade(String Disponibilidade) {
		this.Disponibilidade = Disponibilidade;
	}
	
	public String gettipoQuarto() {
		return tipoQuarto;
	}
	
	public void settipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public double Preco() {
		return Preco;
	}
	
	public void setPreco (double Preco) {
		this.Preco = Preco;
	}
	
	public int Id() {
		return Id;
	}
	
	public void setId (int Id) {
		this.Id = Id;
	}
	
	

	
	
	
	
}