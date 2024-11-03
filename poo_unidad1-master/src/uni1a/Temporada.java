package uni1a;

public class Temporada {
	private int num_Tepo;
	private int episodios;
	public Temporada(int num_Tepo, int episodios) {
	
		this.num_Tepo = num_Tepo;
		this.episodios = episodios;
	}
	//getters y setters para los atributos
	
	public int getNum_Tepo() {
		return num_Tepo;
	}
	public void setNum_Tepo(int num_Tepo) {
		this.num_Tepo = num_Tepo;
	}
	public int getEpisodios() {
		return episodios;
	}
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
}
