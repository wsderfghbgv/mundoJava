package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un ticket de transporte urbano.
 * Ejemplo del mundo real: sistema de transporte publico, metro, bus.
 */
public class TicketTransporte {
    // Atributos privados
    private String linea;
    private String origen;
    private String destino;
    private BigDecimal precio;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private boolean validado;
    private List<String> estacionesIntermedias;

    // Constructor vacio (por defecto)
    public TicketTransporte() {
        this.linea = "L1";
        this.origen = "Estacion Central";
        this.destino = "Estacion Norte";
        this.precio = new BigDecimal("2.50");
        this.fecha = LocalDate.now();
        this.horaSalida = LocalTime.of(8, 0);
        this.validado = false;
        this.estacionesIntermedias = new ArrayList<>();
    }

    // Constructor con parametros (usa setters para validacion)
    public TicketTransporte(String linea, String origen, String destino,
                            BigDecimal precio, LocalDate fecha, LocalTime horaSalida,
                            boolean validado, List<String> estacionesIntermedias) {
        setLinea(linea);
        setOrigen(origen);
        setDestino(destino);
        setPrecio(precio);
        setFecha(fecha);
        setHoraSalida(horaSalida);
        setValidado(validado);
        setEstacionesIntermedias(estacionesIntermedias);
    }

    // Getters
    public String getLinea() {
        return linea;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public boolean isValidado() {
        return validado;
    }

    public List<String> getEstacionesIntermedias() {
        return new ArrayList<>(estacionesIntermedias); // Retorna copia para encapsulacion
    }

    // Setters con validaciones
    public void setLinea(String linea) {
        if (linea == null || linea.trim().isEmpty()) {
            throw new IllegalArgumentException("La linea no puede ser nula o vacia");
        }
        this.linea = linea.trim();
    }

    public void setOrigen(String origen) {
        if (origen == null || origen.trim().isEmpty()) {
            throw new IllegalArgumentException("El origen no puede ser nulo o vacio");
        }
        this.origen = origen.trim();
    }

    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("El destino no puede ser nulo o vacio");
        }
        if (destino.equals(origen)) {
            throw new IllegalArgumentException("El destino no puede ser igual al origen");
        }
        this.destino = destino.trim();
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null) {
            throw new IllegalArgumentException("El precio no puede ser nulo");
        }
        if (precio.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        if (precio.compareTo(new BigDecimal("10000")) >= 0) {
            throw new IllegalArgumentException("El precio debe ser menor que 10000");
        }
        this.precio = precio;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        if (fecha.isBefore(LocalDate.of(2020, 1, 1))) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a 2020");
        }
        this.fecha = fecha;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        if (horaSalida == null) {
            throw new IllegalArgumentException("La hora de salida no puede ser nula");
        }
        this.horaSalida = horaSalida;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public void setEstacionesIntermedias(List<String> estacionesIntermedias) {
        if (estacionesIntermedias == null) {
            this.estacionesIntermedias = new ArrayList<>();
        } else {
            this.estacionesIntermedias = new ArrayList<>(estacionesIntermedias);
        }
    }

    // toString() override
    @Override
    public String toString() {
        return "TicketTransporte{" +
                "linea='" + linea + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", horaSalida=" + horaSalida +
                ", validado=" + validado +
                ", estacionesIntermedias=" + estacionesIntermedias +
                '}';
    }
}

