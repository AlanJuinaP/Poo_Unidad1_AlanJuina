/**
 * Class Documental
 */
package uni1a;
import java.util.*;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador>investigadors = new ArrayList<>();

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
       // this.investigadors = new ArrayList<>();
    }
    
    public String getTema() {
        return tema;
    }
    
    public void setTema(String tema) {
    	this.tema = tema;
    }
    //añadimos un nuevo metodo para agregar un investigador
    //al documental
    public void Agregar_Invest(Investigador investigador) {
    	investigadors.add(investigador);
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores: ");
        for(Investigador investigador : investigadors) {
        	System.out.println(" - " + investigador.getNom_Inves() + ", Especialidad: " + investigador.getEspecialidad());
        }
        System.out.println();
    }
}