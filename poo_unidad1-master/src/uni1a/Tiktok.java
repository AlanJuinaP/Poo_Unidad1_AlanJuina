package uni1a;

public class Tiktok extends ContenidoAudiovisual {
    private String canal;
    private int likes;

    public Tiktok(String titulo, int duracionEnMinutos, String canal, int likes) {
        super(titulo, duracionEnMinutos, "Tiktok");
        this.canal = canal;
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Tiktok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}
