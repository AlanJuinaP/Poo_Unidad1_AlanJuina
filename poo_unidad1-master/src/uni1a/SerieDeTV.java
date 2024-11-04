/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.*;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    //private int temporadas;
  private List<Temporada>temporadas; //composicion con temporada
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        //this.temporadas = temporadas;
        this.temporadas = new ArrayList<>();
    }
    //metodo con el que nons permite agregar una temporada
    public void agregar_Temporada(Temporada temporada) {
    	temporadas.add(temporada);
    }
    
    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    /*public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    */
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporadas");
        for (Temporada temporada : temporadas) {
        	System.out.println(" - Temporada " + temporada.getNum_Tepo() + "con" + temporada.getEpisodios() + "Espisodios");
        }
        System.out.println();
    }
}