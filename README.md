# Laboratorio 2 — Hackathon Express
## SOLID · Patrones de Diseño · UML

**Integrantes:** Sebastián Beltrán · Julián Tinjacá  
**Asignatura:** Desarrollo Orientado a Software  
**Rama:** feature/BeltranSebastian_TinjacaJulian_2026-INT

---

## Estructura del proyecto

```
src/main/java/edu/dosw/bootcamp/lab/
├── solid/
│   └── reto1TiendaDonPepe/
├── creacionales/
│   ├── reto2ChefEstrellas/
│   └── reto3ReinoVehiculos/
├── comportamiento/
│   ├── reto4CasaDeCambio/
│   ├── reto6SoporteTecnico/
│   └── reto7ControlRemoto/
└── estructurales/
    ├── reto5CafePersonalizado/
    └── reto8Zoologico/
```

---

# Reto 1 — La Tienda de Don Pepe

## Descripción



## Principios SOLID aplicados



## Polimorfismo



## Inmutabilidad



## Streams usados



## Evidencia de ejecución



---

# Reto 2 — El Chef de 5 Estrellas

## Descripción



## Patrón de Diseño

**Categoría:**  
**Patrón utilizado:**

**Justificación:**

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
|  |  |

## Evidencia de ejecución



---

# Reto 3 — El Reino de los Vehículos

## Descripción
Concesionaria que vende vehículos de tierra, acuáticos y aéreos en tres categorías: Económico, Lujo y Usado. El usuario elige cuántos vehículos comprar, su tipo, modelo y categoría. Al final se muestra el resumen con el total calculado con Streams.

## Patrón de Diseño

**Categoría:** Creacional  
**Patrón utilizado:** Abstract Factory

**Justificación:** El problema tiene dos dimensiones de variación: el tipo de medio (tierra, acuático, aéreo) y la categoría (económico, lujo, usado). Abstract Factory permite crear familias de vehículos sin que el código cliente conozca las clases concretas. Agregar un nuevo tipo de medio solo requiere crear una nueva fábrica sin modificar nada existente, cumpliendo el principio Abierto/Cerrado.

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
| `FabricaVehiculos` | Interfaz Abstract Factory — define `crearVehiculo(modelo, categoria)` |
| `FabricaTierra` | Fábrica concreta — crea Auto, Bicicleta, Moto |
| `FabricaAcuatica` | Fábrica concreta — crea Lancha, Velero, Jet Ski |
| `FabricaAerea` | Fábrica concreta — crea Avion, Avioneta, Helicoptero |
| `Vehiculo` | Producto abstracto — atributos comunes y getters |
| `Auto`, `Moto`, `Lancha`, etc. | Productos concretos — velocidad y precio según categoría |
| `Reto3ReinoVehiculos` | Cliente — selecciona la fábrica y llama `crearVehiculo()` |

## Streams usados
- `compra.stream().mapToDouble(Vehiculo::getPrecio).sum()` para calcular el total de la compra.

## Evidencia de ejecución



---

# Reto 4 — La Estafa de la Casa de Cambio

## Descripción



## Patrón de Diseño

**Categoría:**  
**Patrón utilizado:**

**Justificación:**

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
|  |  |

## Streams usados



## Evidencia de ejecución



---

# Reto 5 — El Café Personalizado

## Descripción



## Patrón de Diseño

**Categoría:**  
**Patrón utilizado:**

**Justificación:**

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
|  |  |

## Evidencia de ejecución



---

# Reto 6 — Soporte Técnico

## Descripción
Sistema de soporte que recibe tickets con distintos niveles de complejidad (básico, intermedio, avanzado, crítico). Cada técnico intenta resolver el ticket y si no puede, lo pasa al siguiente en la cadena. Al final se muestran estadísticas generadas con Streams.

## Patrón de Diseño

**Categoría:** Comportamiento  
**Patrón utilizado:** Chain of Responsibility

**Justificación:** El sistema no sabe de antemano qué técnico resolverá cada ticket. La cadena permite que cada técnico intente resolverlo y, si no puede, lo pase al siguiente sin que el cliente lo sepa. Agregar un nuevo nivel de soporte solo requiere crear un nuevo `Tecnico` e insertarlo en la cadena, sin tocar el código existente.

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
| `Tecnico` | Handler abstracto — define `manejar()` y `setSiguiente()` |
| `TecnicoBasico` | Handler concreto — resuelve nivel básico, pasa el resto |
| `TecnicoIntermedio` | Handler concreto — resuelve nivel intermedio, pasa el resto |
| `TecnicoAvanzado` | Handler concreto — resuelve nivel avanzado, marca pendiente si es crítico |
| `Ticket` | Contiene descripción, nivel, prioridad y estado de resolución |
| `Reto6SoporteTecnico` | Cliente — construye la cadena y envía los tickets |

## Streams usados
- Conteo por técnico: `tickets.stream().filter(t -> t.isResuelto() && t.getResolvedBy().equals(...)).count()`
- Pendientes: `tickets.stream().filter(t -> !t.isResuelto()).count()`
- Promedio de prioridad: `tickets.stream().filter(Ticket::isResuelto).mapToInt(Ticket::getPrioridadValor).average()`

## Evidencia de ejecución



---

# Reto 7 — El Control Remoto Mágico

## Descripción
Control remoto que permite a múltiples usuarios ejecutar acciones sobre dispositivos del hogar (luces, puertas, música, persianas). Registra qué usuario realizó cada acción, mantiene un historial completo y permite deshacer acciones individuales.

## Patrón de Diseño

**Categoría:** Comportamiento  
**Patrón utilizado:** Command

**Justificación:** El patrón Command encapsula cada acción como un objeto independiente, lo que permite guardarlas en un historial y deshacerlas sin que el control remoto conozca los detalles internos de cada dispositivo. Cada comando sabe cómo ejecutarse y cómo revertirse, lo que hace que el undo sea limpio y extensible.

**Cómo lo apliqué:**

| Clase | Rol |
|-------|-----|
| `Comando` | Interfaz — define `ejecutar()`, `deshacer()`, `getDescripcion()` |
| `ComandoLuces` | Comando concreto — encender/apagar con intensidad |
| `ComandoPuertas` | Comando concreto — abrir/cerrar puerta |
| `ComandoMusica` | Comando concreto — reproducir/parar con volumen |
| `ComandoPersianas` | Comando concreto — subir/bajar con porcentaje |
| `RegistroAccion` | Almacena el comando, el usuario y si fue deshecho |
| `ControlRemoto` | Invocador — ejecuta comandos y mantiene el historial |
| `Reto7ControlRemoto` | Cliente — crea los comandos según el input del usuario |

## Evidencia de ejecución



---

# Reto 8 — El Zoológico de los UML

## Descripción
Sistema de gestión del zoológico ECI Zoo con animales de tres especies (mamíferos, reptiles y aves), cuidadores que los atienden y visitantes que interactúan con ellos. Diseñado con principios SOLID y el patrón Decorator para atributos dinámicos.

## Diagrama UML de Clases

![Reto 8.png](src/main/java/edu/dosw/bootcamp/lab/estructurales/reto8/Reto%208.png)

## Patrón de Diseño

**Categoría:** Estructural  
**Patrón utilizado:** Decorator

**Justificación:** Los animales pueden tener atributos dinámicos adicionales (color de pelaje, origen, rareza, historial médico) que no todos comparten y que pueden combinarse entre sí. El patrón Decorator permite agregar estos atributos envolviendo el animal en capas sin modificar las clases base ni crear una explosión de subclases para cada combinación posible.

