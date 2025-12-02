# Diagramas UML - Clases del Proyecto EntornoPOO

Este documento contiene los diagramas UML de las tres clases encapsuladas del proyecto.

---

## 1. Diagrama UML - CafeEspecialidad


┌──────────────────────────────────────┐
│    CafeEspecialidad                  │
├──────────────────────────────────────┤
│ - origen: String                     │
│ - temperatura: double                │
│ - tamanio: int                       │
│ - precio: BigDecimal                 │
│ - intensidad: int                    │
│ - fechaTostado: LocalDate            │
│ - disponible: boolean                │
│ - metodoPreparacion: String          │
├──────────────────────────────────────┤
│ + CafeEspecialidad()                 │
│ + CafeEspecialidad(...)              │
│ + get...() / set...()                │
│ + toString()                         │
└──────────────────────────────────────┘
```

---

## 2. Diagrama UML - TicketTransporte

┌──────────────────────────────────────┐
│    TicketTransporte                  │
├──────────────────────────────────────┤
│ - linea: String                      │
│ - origen: String                     │
│ - destino: String                    │
│ - precio: BigDecimal                 │
│ - fecha: LocalDate                   │
│ - horaSalida: LocalTime              │
│ - validado: boolean                  │
│ - estacionesIntermedias: List<String>│
├──────────────────────────────────────┤
│ + TicketTransporte()                 │
│ + TicketTransporte(...)              │
│ + get...() / set...()                │
│ + toString()                         │
└──────────────────────────────────────┘
```

---

## 3. Diagrama UML - PerfilRedSocial

┌──────────────────────────────────────┐
│    PerfilRedSocial                   │
├──────────────────────────────────────┤
│ - alias: String                      │
│ - numeroSeguidores: int              │
│ - numeroSiguiendo: int               │
│ - fotoPerfil: String                 │
│ - biografia: String                  │
│ - fechaRegistro: LocalDate           │
│ - cuentaVerificada: boolean          │
│ - publicacionesRecientes: List<String>│
├──────────────────────────────────────┤
│ + PerfilRedSocial()                  │
│ + PerfilRedSocial(...)               │
│ + get...() / set...()                │
│ + toString()                         │
└──────────────────────────────────────┘
```

---

## Notas sobre la Notación UML

### Símbolos de Visibilidad:
- **`-`** = private (privado)
- **`+`** = public (público)
- **`#`** = protected (protegido)
- **`~`** = package (paquete)

### Formato de Atributos:
```
- nombreAtributo: Tipo
```

### Formato de Métodos:
```
+ nombreMetodo(parametro: Tipo): TipoRetorno
```

### Constructores:
- Constructor vacío: `+ NombreClase()`
- Constructor con parámetros: `+ NombreClase(param1: Tipo1, param2: Tipo2, ...)`


```
┌──────────────────────┐     ┌──────────────────────┐     ┌──────────────────────┐
│  CafeEspecialidad    │     │  TicketTransporte    │     │  PerfilRedSocial     │
├──────────────────────┤     ├──────────────────────┤     ├──────────────────────┤
│ - origen: String     │     │ - linea: String      │     │ - alias: String      │
│ - temperatura: double│     │ - origen: String     │     │ - numeroSeguidores:  │
│ - tamanio: int       │     │ - destino: String    │     │ - numeroSiguiendo:   │
│ - precio: BigDecimal │     │ - precio: BigDecimal │     │ - fotoPerfil: String │
│ - intensidad: int    │     │ - fecha: LocalDate   │     │ - biografia: String  │
│ - fechaTostado:      │     │ - horaSalida:        │     │ - fechaRegistro:     │
│   LocalDate          │     │   LocalTime          │     │   LocalDate          │
│ - disponible:        │     │ - validado: boolean  │     │ - cuentaVerificada:  │
│   boolean            │     │ - estaciones:        │     │   boolean            │
│ - metodoPreparacion: │     │   List<String>       │     │ - publicaciones:     │
│   String             │     │                      │     │   List<String>       │
├──────────────────────┤     ├──────────────────────┤     ├──────────────────────┤
│ + CafeEspecialidad() │     │ + TicketTransporte() │     │ + PerfilRedSocial()  │
│ + CafeEspecialidad(..)│    │ + TicketTransporte(..)│    │ + PerfilRedSocial(..)│
│ + get...() / set...()│     │ + get...() / set...()│     │ + get...() / set...()│
│ + toString()         │     │ + toString()         │     │ + toString()         │
└──────────────────────┘     └──────────────────────┘     └──────────────────────┘
```

---

**Fecha de creación**: 2024
**Proyecto**: EntornoPOO
**Paquete**: modelo

