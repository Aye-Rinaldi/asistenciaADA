package ar.com.xeven;

import java.time.LocalDate;
import java.util.List;

public class Alumna {
    //atributos
    private List<Asistencia> asistencias;

    //constructor
    public Alumna(List<Asistencia> asistencias)  {
        this.asistencias = asistencias;
    }

    //getter
    public List<Asistencia> getAsistencias() {
        return asistencias;

    }

    //METODOS
    public boolean asistioAClase(LocalDate fecha) {
        for (Asistencia asistencia:asistencias)
            if (asistencia.getFechaClase().equals(fecha))
                return true;
        return false;
}

    public boolean asistioAClaseEnVivo(LocalDate fecha) {
        for (Asistencia asistencia:asistencias){
            if (asistencia.getFechaClase().equals(fecha) && asistencia.isEnVivo()){
                return true;
            }
        }
        return false;
    }

    //c) cantidad de asistencias de una alumna
    public Integer getTotalAsistencias(){
        return  asistencias.size();
    }


}
