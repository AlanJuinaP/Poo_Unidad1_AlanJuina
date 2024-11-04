package uni1a;

public class Tiktok extends ContenidoAudiovisual{
	private String creador;
	private int visualizaciones;
	
	public Tiktok(String titulo, int duracionEnMinutos, String genero, String creador, int visualizaciones) {
		super(titulo, duracionEnMinutos, genero);
		this.creador = creador;
		this.visualizaciones = visualizaciones;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getVisualizaciones() {
		return visualizaciones;
	}
	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	
	@Override
	public void mostrarDetalles() {
		// TODO Auto-generated method stub
		System.out.println("Detalles del video de Tiktok: ");
		System.out.println("ID" + getId());
		System.out.println("Ttitulo" + getTitulo());
		System.out.println("Diracion en minutos: " + getDuracionEnMinutos());
		System.out.println("Genero" + getGenero());
		System.out.println("Creador" + creador);
		System.out.println("Visualizaciones" + visualizaciones);
		
		System.out.println();
	}
}
