package poo;
import uni1a.*;
import uni1a.ContenidoAudiovisual;  // Importa esta clase del paquete uni1a
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Documental;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        Pelicula avatar = new Pelicula("Avatar",125,"Accion","20th Century Studios");
        SerieDeTV got = new SerieDeTV("Game of Thrones", 68,"Fantasy");
        Documental cosmos = new Documental("Cosmos",45,"Science","Astronomy");
        
       
        
        avatar.agregar_Autor(new Actor("Jame cameron",70));
        avatar.agregar_Autor(new Actor("Zoe Saldaña",46));
        
        got.agregar_Temporada(new Temporada(5,16));
        got.agregar_Temporada(new Temporada(1,20));
        
        cosmos.Agregar_Invest(new Investigador("Marie Curie","Cientifica"));
        cosmos.Agregar_Invest(new Investigador("Charles Darwin","Biologia"));
        // Mostrar los detalles de cada contenido audiovisual
        ContenidoAudiovisual[] contenidos = {avatar,got,cosmos};
        
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}