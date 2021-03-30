package ar.com.xeven;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asistencia {
    //atributos
    private LocalDateTime fechaAsistencia; //fecha y hs en que ve la clase
    private LocalDate fechaClase; //fecha real de la clase
    private Boolean enVivo; //V si vio la clase en vivio; F vio la grabacion


    //constructor
    public Asistencia(LocalDateTime fechaAsistencia, LocalDate fechaClase, Boolean enVivo) {
        this.fechaAsistencia = fechaAsistencia;
        this.fechaClase = fechaClase;
        this.enVivo = enVivo;
    }

    //getters
    public LocalDateTime getFechaAsistencia() {
        return fechaAsistencia;
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public Boolean isEnVivo() {
        return enVivo;
    }
}
