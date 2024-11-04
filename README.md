Proyecto de Contenidos Audiovisuales
Objetivo y Propósito
Este proyecto simula un sistema de gestión de contenido audiovisual con clases en Java, permitiendo almacenar y visualizar detalles sobre varios tipos de contenidos, como películas, series de televisión, documentales, videos cortos de YouTube y TikToks. El objetivo es practicar la programación orientada a objetos y aprender a gestionar diferentes tipos de datos en una aplicación de Java.
Ejecución del Proyecto
Clonar el repositorio:
git clone <URL_DEL_REPOSITORIO>
javac -d bin src/uni1a/*.java src/poo/PruebaAudioVisual.java
java -cp bin poo.PruebaAudioVisual

Clases y Funcionalidades
ContenidoAudiovisual: Clase abstracta base que define las propiedades comunes (título, duración, género) de los contenidos.
Pelicula: Representa una película y permite añadir actores asociados.
SerieDeTV: Representa una serie de televisión y permite agregar temporadas, cada una con su número de episodios.
Documental: Representa un documental y permite añadir investigadores asociados.
ShortYouTube y Tiktok: Representan contenidos de video corto y permiten almacenar la cantidad de "likes" y el canal asociado.
PruebaAudioVisual: Clase principal para crear instancias de los diferentes tipos de contenidos y mostrar sus detalles.
