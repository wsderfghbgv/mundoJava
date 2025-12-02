package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un perfil de red social.
 * Ejemplo del mundo real: Instagram, Twitter, Facebook, LinkedIn.
 */
public class PerfilRedSocial {
    // Atributos privados
    private String alias;
    private int numeroSeguidores;
    private int numeroSiguiendo;
    private String fotoPerfil;
    private String biografia;
    private LocalDate fechaRegistro;
    private boolean cuentaVerificada;
    private List<String> publicacionesRecientes;

    // Constructor vacio (por defecto)
    public PerfilRedSocial() {
        this.alias = "usuario_anonimo";
        this.numeroSeguidores = 0;
        this.numeroSiguiendo = 0;
        this.fotoPerfil = "default.jpg";
        this.biografia = "Sin biografia";
        this.fechaRegistro = LocalDate.now();
        this.cuentaVerificada = false;
        this.publicacionesRecientes = new ArrayList<>();
    }

    // Constructor con parametros (usa setters para validacion)
    public PerfilRedSocial(String alias, int numeroSeguidores, int numeroSiguiendo,
                          String fotoPerfil, String biografia, LocalDate fechaRegistro,
                          boolean cuentaVerificada, List<String> publicacionesRecientes) {
        setAlias(alias);
        setNumeroSeguidores(numeroSeguidores);
        setNumeroSiguiendo(numeroSiguiendo);
        setFotoPerfil(fotoPerfil);
        setBiografia(biografia);
        setFechaRegistro(fechaRegistro);
        setCuentaVerificada(cuentaVerificada);
        setPublicacionesRecientes(publicacionesRecientes);
    }

    // Getters
    public String getAlias() {
        return alias;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public int getNumeroSiguiendo() {
        return numeroSiguiendo;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public String getBiografia() {
        return biografia;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isCuentaVerificada() {
        return cuentaVerificada;
    }

    public List<String> getPublicacionesRecientes() {
        return new ArrayList<>(publicacionesRecientes); // Retorna copia para encapsulacion
    }

    // Setters con validaciones
    public void setAlias(String alias) {
        if (alias == null || alias.trim().isEmpty()) {
            throw new IllegalArgumentException("El alias no puede ser nulo o vacio");
        }
        if (alias.length() < 3 || alias.length() > 30) {
            throw new IllegalArgumentException("El alias debe tener entre 3 y 30 caracteres");
        }
        if (!alias.matches("^[a-zA-Z0-9_]+$")) {
            throw new IllegalArgumentException("El alias solo puede contener letras, numeros y guiones bajos");
        }
        this.alias = alias.trim();
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        if (numeroSeguidores < 0) {
            throw new IllegalArgumentException("El numero de seguidores no puede ser negativo");
        }
        if (numeroSeguidores > 1000000000) {
            throw new IllegalArgumentException("El numero de seguidores no puede exceder 1,000,000,000");
        }
        this.numeroSeguidores = numeroSeguidores;
    }

    public void setNumeroSiguiendo(int numeroSiguiendo) {
        if (numeroSiguiendo < 0) {
            throw new IllegalArgumentException("El numero de cuentas que sigue no puede ser negativo");
        }
        if (numeroSiguiendo > 100000) {
            throw new IllegalArgumentException("El numero de cuentas que sigue no puede exceder 100,000");
        }
        this.numeroSiguiendo = numeroSiguiendo;
    }

    public void setFotoPerfil(String fotoPerfil) {
        if (fotoPerfil == null || fotoPerfil.trim().isEmpty()) {
            throw new IllegalArgumentException("La foto de perfil no puede ser nula o vacia");
        }
        this.fotoPerfil = fotoPerfil.trim();
    }

    public void setBiografia(String biografia) {
        if (biografia == null) {
            this.biografia = "";
        } else if (biografia.length() > 150) {
            throw new IllegalArgumentException("La biografia no puede exceder 150 caracteres");
        } else {
            this.biografia = biografia.trim();
        }
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        if (fechaRegistro == null) {
            throw new IllegalArgumentException("La fecha de registro no puede ser nula");
        }
        if (fechaRegistro.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de registro no puede ser futura");
        }
        if (fechaRegistro.isBefore(LocalDate.of(2000, 1, 1))) {
            throw new IllegalArgumentException("La fecha de registro no puede ser anterior a 2000");
        }
        this.fechaRegistro = fechaRegistro;
    }

    public void setCuentaVerificada(boolean cuentaVerificada) {
        this.cuentaVerificada = cuentaVerificada;
    }

    public void setPublicacionesRecientes(List<String> publicacionesRecientes) {
        if (publicacionesRecientes == null) {
            this.publicacionesRecientes = new ArrayList<>();
        } else {
            this.publicacionesRecientes = new ArrayList<>(publicacionesRecientes);
        }
    }

    // toString() override
    @Override
    public String toString() {
        return "PerfilRedSocial{" +
                "alias='" + alias + '\'' +
                ", numeroSeguidores=" + numeroSeguidores +
                ", numeroSiguiendo=" + numeroSiguiendo +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                ", biografia='" + biografia + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", cuentaVerificada=" + cuentaVerificada +
                ", publicacionesRecientes=" + publicacionesRecientes +
                '}';
    }
}

