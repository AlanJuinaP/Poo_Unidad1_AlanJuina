/**
 * Class Pelicula
 */
package uni1a;
//import uni1a.Actor;
import java.util.*;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor>actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        //this.actores = new ArrayList<>();//lista de actores
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    

	public void agregar_Autor(Actor actor) {
		actores.add(actor);
	}

	@Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        //Agregacion de impresion de nuevos metodos
        System.out.println("Actores:");
        //condicion para impresion de actores con su edad
        for(Actor actor : actores) {
        	System.out.println(" - " + actor.getNom() + ",Edad" + actor.getEdad());
        }
        System.out.println();
    }
}