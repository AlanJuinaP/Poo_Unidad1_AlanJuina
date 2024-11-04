package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        Pelicula avatar = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        SerieDeTV got = new SerieDeTV("Game of Thrones", 68, "Fantasy");
        Documental cosmos = new Documental("Cosmos", 45, "Science", "Astronomy");
        Tiktok tiktokVideo = new Tiktok("Paracaidismo", 1, "Accion", 50000);
        ShortYouTube youtubeShort = new ShortYouTube("Race F1", 1, "Short", 1000000);

        // Agregar actores, temporadas e investigadores
        avatar.agregarAutor(new Actor("James Cameron", 70));
        avatar.agregarAutor(new Actor("Zoe Saldaña", 46));

        got.agregarTemporada(new Temporada(1, 10)); // Añadir temporadas como ejemplo
        got.agregarTemporada(new Temporada(2, 10));

        cosmos.Agregar_Invest(new Investigador("Marie Curie", "Científica"));
        cosmos.Agregar_Invest(new Investigador("Charles Darwin", "Biología"));

        // Mostrar detalles
        ContenidoAudiovisual[] contenidos = {avatar, got, cosmos, tiktokVideo, youtubeShort};

        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
