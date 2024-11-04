/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.*;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
  private int temporadas;
  private List<Temporada>listaTemporadas = new ArrayList<>(); //composicion con temporada
  
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        //this.temporadas = new ArrayList<>();
    }
    
    
    public int getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}


	//metodo con el que nons permite agregar una temporada
    public void agregar_Temporada(Temporada temporada) {
    	listaTemporadas.add(temporada);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Lista de Temporadas");
        for (Temporada temp : listaTemporadas) {
        	System.out.println(" - Temporada " + temp.getNum_Tepo());
        }
        System.out.println();
    }
}