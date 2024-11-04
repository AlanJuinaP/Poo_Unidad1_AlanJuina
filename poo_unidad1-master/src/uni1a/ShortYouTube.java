package uni1a;

public class ShortYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;

    public ShortYouTube(String titulo, int duracionEnMinutos, String canal, int likes) {
        super(titulo, duracionEnMinutos, "Short");
        this.canal = canal;
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Short de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}
