package ar.com.xeven;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    //atributos
    private List<Alumna> alumnas;
    private Profesor profesor;

    //constructor
    public Curso(List<Alumna> alumnas, Profesor profesor) {
        this.alumnas = alumnas;
        this.profesor = profesor;
    }


    //getters y setters
    //alumnas
    public List<Alumna> getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(List<Alumna> alumnas) {
        this.alumnas = alumnas;
    }

    //profesor
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }



    //METODOS
    //a) Asistentes a una clase determinada
    public List<Alumna> listarAsistentesAClase(LocalDate fecha){
        List<Alumna> asistentes = new ArrayList<>();
        for (Alumna a:alumnas)
            if (a.asistioAClase(fecha))
                asistentes.add(a);
        return asistentes;
    }

    //b)Alumnas que vieron una clase en vivo
    public List<Alumna> listarAsistentesEnVivoALaClase(LocalDate fecha){
        List<Alumna> asistentes = new ArrayList<>();
        for (Alumna a:alumnas){
            if (a.asistioAClaseEnVivo(fecha)){
                asistentes.add(a);
            }
        }
        return asistentes;
    }
}
