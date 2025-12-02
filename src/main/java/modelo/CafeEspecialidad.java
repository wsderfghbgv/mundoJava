package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Clase que representa un cafe de especialidad con todas sus caracteristicas.
 * Ejemplo del mundo real: cafeteria, tienda de cafe especializado.
 */
public class CafeEspecialidad {
    // Atributos privados
    private String origen;
    private double temperatura;
    private int tamanio; // en ml
    private BigDecimal precio;
    private int intensidad; // escala 1-10
    private LocalDate fechaTostado;
    private boolean disponible;
    private String metodoPreparacion;

    // Constructor vacio (por defecto)
    public CafeEspecialidad() {
        this.origen = "Colombia";
        this.temperatura = 85.0;
        this.tamanio = 250;
        this.precio = new BigDecimal("5.50");
        this.intensidad = 5;
        this.fechaTostado = LocalDate.now().minusDays(7);
        this.disponible = true;
        this.metodoPreparacion = "Espresso";
    }

    // Constructor con parametros (usa setters para validacion)
    public CafeEspecialidad(String origen, double temperatura, int tamanio, 
                           BigDecimal precio, int intensidad, LocalDate fechaTostado,
                           boolean disponible, String metodoPreparacion) {
        setOrigen(origen);
        setTemperatura(temperatura);
        setTamanio(tamanio);
        setPrecio(precio);
        setIntensidad(intensidad);
        setFechaTostado(fechaTostado);
        setDisponible(disponible);
        setMetodoPreparacion(metodoPreparacion);
    }

    // Getters
    public String getOrigen() {
        return origen;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getTamanio() {
        return tamanio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public LocalDate getFechaTostado() {
        return fechaTostado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getMetodoPreparacion() {
        return metodoPreparacion;
    }

    // Setters con validaciones
    public void setOrigen(String origen) {
        if (origen == null || origen.trim().isEmpty()) {
            throw new IllegalArgumentException("El origen no puede ser nulo o vacio");
        }
        this.origen = origen.trim();
    }

    public void setTemperatura(double temperatura) {
        if (temperatura < 0 || temperatura > 100) {
            throw new IllegalArgumentException("La temperatura debe estar entre 0 y 100 grados");
        }
        this.temperatura = temperatura;
    }

    public void setTamanio(int tamanio) {
        if (tamanio <= 0 || tamanio > 1000) {
            throw new IllegalArgumentException("El tamano debe estar entre 1 y 1000 ml");
        }
        this.tamanio = tamanio;
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

    public void setIntensidad(int intensidad) {
        if (intensidad < 1 || intensidad > 10) {
            throw new IllegalArgumentException("La intensidad debe estar entre 1 y 10");
        }
        this.intensidad = intensidad;
    }

    public void setFechaTostado(LocalDate fechaTostado) {
        if (fechaTostado == null) {
            throw new IllegalArgumentException("La fecha de tostado no puede ser nula");
        }
        if (fechaTostado.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de tostado no puede ser futura");
        }
        if (fechaTostado.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha de tostado no puede ser anterior a 2010");
        }
        this.fechaTostado = fechaTostado;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setMetodoPreparacion(String metodoPreparacion) {
        if (metodoPreparacion == null || metodoPreparacion.trim().isEmpty()) {
            throw new IllegalArgumentException("El metodo de preparacion no puede ser nulo o vacio");
        }
        this.metodoPreparacion = metodoPreparacion.trim();
    }

    // toString() override
    @Override
    public String toString() {
        return "CafeEspecialidad{" +
                "origen='" + origen + '\'' +
                ", temperatura=" + temperatura +
                ", tamanio=" + tamanio + " ml" +
                ", precio=" + precio +
                ", intensidad=" + intensidad +
                ", fechaTostado=" + fechaTostado +
                ", disponible=" + disponible +
                ", metodoPreparacion='" + metodoPreparacion + '\'' +
                '}';
    }
}

