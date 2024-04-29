package model;

public class Reserva {
	private int Id;
	private int idQuarto;
	private int idUsuario;
	private int dataInicio;
	private int dataFim;
	private String status;
	
	public Reserva (int Id, int idQuarto, int idUsuario, int dataInicio, int dataFim, String status) {
		this.Id = Id;
		this.idQuarto = idQuarto;
		this.idUsuario = idUsuario;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = "aberto";
	}

	// GET SET Id
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	// GET SET idQuarto
	public int getidQuarto() {
		return idQuarto;
	}
	
	public void setidQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	// GET SET idUsuario
	public int getidUsuario() {
		return idUsuario;
	}
	
	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	// GET SET dataInicio
	public int getdataInicio() {
		return dataInicio;
	}
	
	public void getdataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	// GET SET dataFim
	public int getdataFim() {
		return dataFim;
	}
	
	public void setdataFim(int dataFim) {
		this.dataFim = dataFim;
	}
	
	// GET SET status
	public String getstatus() {
		return status;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}
}