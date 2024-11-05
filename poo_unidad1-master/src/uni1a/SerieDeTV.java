/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.*;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> listaTemporadas = new ArrayList<>(); //composicion con temporada
  
  public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
      super(titulo, duracionEnMinutos, genero);
  }
    
  //metodo con el que nons permite agregar una temporada
    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }
    
	
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de Temporadas: " + listaTemporadas.size());
        System.out.println("Lista de Temporadas:");
        for (Temporada temp : listaTemporadas) {
            System.out.println(" - Temporada " + temp.getNum_Tepo() + " con " + temp.getNum_episodios() + " episodios.");
        }
        System.out.println();
    }
}