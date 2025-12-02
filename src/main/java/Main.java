import modelo.CafeEspecialidad;
import modelo.TicketTransporte;
import modelo.PerfilRedSocial;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACION DE CLASES ENCAPSULADAS ===\n");
        
        // ========== CAFE ESPECIALIDAD ==========
        System.out.println("--- CAFE ESPECIALIDAD ---");
        
        // Objeto 1: Constructor vacio
        CafeEspecialidad cafe1 = new CafeEspecialidad();
        System.out.println("Cafe 1 (Constructor vacio):");
        System.out.println(cafe1.toString());
        System.out.println();
        
        // Objeto 2: Constructor con parametros
        CafeEspecialidad cafe2 = new CafeEspecialidad(
            "Etiopia",
            92.5,
            350,
            new BigDecimal("8.75"),
            8,
            LocalDate.of(2024, 1, 15),
            true,
            "V60"
        );
        System.out.println("Cafe 2 (Constructor con parametros):");
        System.out.println(cafe2.toString());
        System.out.println();
        
        // ========== TICKET TRANSPORTE ==========
        System.out.println("--- TICKET TRANSPORTE ---");
        
        // Objeto 1: Constructor vacio
        TicketTransporte ticket1 = new TicketTransporte();
        System.out.println("Ticket 1 (Constructor vacio):");
        System.out.println(ticket1.toString());
        System.out.println();
        
        // Objeto 2: Constructor con parametros
        List<String> estaciones = Arrays.asList("Estacion Sur", "Estacion Centro", "Estacion Este");
        TicketTransporte ticket2 = new TicketTransporte(
            "L5",
            "Terminal Norte",
            "Aeropuerto",
            new BigDecimal("4.20"),
            LocalDate.of(2024, 2, 20),
            LocalTime.of(14, 30),
            true,
            estaciones
        );
        System.out.println("Ticket 2 (Constructor con parametros):");
        System.out.println(ticket2.toString());
        System.out.println();
        
        // ========== PERFIL RED SOCIAL ==========
        System.out.println("--- PERFIL RED SOCIAL ---");
        
        // Objeto 1: Constructor vacio
        PerfilRedSocial perfil1 = new PerfilRedSocial();
        System.out.println("Perfil 1 (Constructor vacio):");
        System.out.println(perfil1.toString());
        System.out.println();
        
        // Objeto 2: Constructor con parametros
        List<String> publicaciones = Arrays.asList(
            "Nuevo proyecto terminado!",
            "Dia soleado en el parque",
            "Aprendiendo Java POO"
        );
        PerfilRedSocial perfil2 = new PerfilRedSocial(
            "dev_juan2024",
            1250,
            340,
            "foto_perfil.jpg",
            "Desarrollador de software apasionado por Java y POO",
            LocalDate.of(2023, 6, 10),
            true,
            publicaciones
        );
        System.out.println("Perfil 2 (Constructor con parametros):");
        System.out.println(perfil2.toString());
        System.out.println();
        
        System.out.println("=== FIN DE LA DEMOSTRACION ===");
    }
}

