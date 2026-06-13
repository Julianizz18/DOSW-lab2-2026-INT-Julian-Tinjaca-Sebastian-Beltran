# Laboratorio 2 — SOLID · Patrones de Diseño · UML · POO Avanzada
### Escuela Colombiana de Ingeniería Julio Garavito
**Compañía:** DOSW COMPANY

---

## Integrantes del Grupo
* **Integrante :** Julian Camilo Tinjaca Corredor
* **Integrante :** Johan Sebasgei Beltran Gutierrez

---

## Desarrollo del Cuestionario

### 01. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?


Evita el acoplamiento rígido y la necesidad de modificar el código existente cada vez que se añade un nuevo comportamiento.

Al usar condicionales, el sistema se vuelve difícil de mantener y propenso a errores, ya que cualquier cambio exige buscar y modificar cada estructura condicional en el proyecto. Con el polimorfismo, el comportamiento se delega a las subclases o implementaciones; si se requiere un nuevo comportamiento, simplemente se crea una nueva clase sin tocar el código que la consume.

---

### 02. ¿Por qué una clase inmutable puede mejorar la seguridad en un sistema?

Una clase inmutable garantiza que el estado de un objeto no pueda ser modificado una vez creado. Esto mejora la seguridad en varios aspectos:
* **Hilos seguros:** En entornos concurrentes/multihilo, varios hilos pueden compartir el objeto sin riesgo de corrupción de datos o condiciones de carrera, eliminando la necesidad de sincronización compleja.
* **Integridad de datos:** Evita efectos secundarios no deseados causados por referencias compartidas .
* **Consistencia:** Los objetos inmutables son ideales como claves en mapas  o elementos en conjuntos , asegurando que su hashCode nunca cambie.

---

### 03. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?

Rompe por completo el principio de **encapsulamiento**. Los principales problemas que genera son:
* **Pérdida de control y validación:** Cualquier clase externa puede asignar valores inválidos o incoherentes a los atributos.
* **Alto acoplamiento:** Si el nombre o el tipo de dato de un atributo cambia, todas las clases externas que accedían directamente a él se romperán, obligando a refactorizar gran parte del sistema.
* **Falta de flexibilidad:** No se pueden crear atributos de "solo lectura" o realizar operaciones lógicas ocultas  al momento de modificar un valor.

---

### 04. Según el principio Abierto/Cerrado, ¿cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

El sistema debe modificarse mediante extensión, no mediante alteración directa del código fuente.

Para lograrlo, el diseño original debe depender de abstracciones. Cuando se requiere una nueva funcionalidad, se crea una nueva clase que implemente la interfaz o herede de la clase abstracta correspondiente. De este modo, el comportamiento del sistema se extiende agregando código nuevo, mientras que las clases preexistentes permanecen intactas, reduciendo drásticamente el riesgo de introducir regresiones.

---

### 05. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad? Da un ejemplo donde se vulnere.

#### Explicación:
Es fundamental porque asegura que una clase tenga una única razón para cambiar. Esto incrementa la cohesión del código, facilita la lectura, simplifica las pruebas unitarias y reduce el impacto de los cambios, ya que las modificaciones en un requerimiento específico solo afectarán a la clase encargada de esa tarea.

#### Ejemplo de Vulneración:
A continuación se presenta una clase Invoice que vulnera el principio, ya que se encarga de gestionar los datos de la factura, calcular los impuestos, guardarlos en la base de datos y enviar un correo electrónico.

```java
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotalWithTax() {
        return this.amount * 1.19;
    }

    public void saveToDatabase() {
        System.out.println("Guardando la factura en la base de datos...");
    }
    
    public void sendEmailNotification() {
        System.out.println("Enviando la factura por correo electrónico...");
    }
}
```