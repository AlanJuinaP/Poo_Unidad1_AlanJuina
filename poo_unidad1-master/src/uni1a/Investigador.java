package uni1a;

public class Investigador {
private String nom_Inves;
private String especialidad;
public Investigador(String nom_Inves, String especialidad) {
	this.nom_Inves = nom_Inves;
	this.especialidad = especialidad;
}
//getters y setters para los atributos

public String getNom_Inves() {
	return nom_Inves;
}
public void setNom_Inves(String nom_Inves) {
	this.nom_Inves = nom_Inves;
}
public String getEspecialidad() {
	return especialidad;
}
public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

}
