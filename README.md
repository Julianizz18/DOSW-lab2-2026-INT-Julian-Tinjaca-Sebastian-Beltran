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
### 06. ¿Qué es y para qué usamos el pom.xml?
El pom.xml es el archivo de configuración central que utiliza Maven para gestionar un proyecto. Lo usamos principalmente para:
* **Manejar las dependencias:** En lugar de descargar los archivos .jar manualmente de internet, los escribimos en este archivo y Maven los descarga e incluye automáticamente.
* **Información del proyecto:** Guarda los datos básicos del proyecto como el nombre, el grupo, el ID del artefactoy la versión que estamos desarrollando.
* **Configurar la versión de Java:** Nos permite definir con qué versión de Java se debe compilar el código para que no haya errores de compatibilidad.

---

### 07. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?

La diferencia principal es que Maven funciona por etapas consecutivas, lo que significa que cada comando hace lo suyo y también ejecuta todo lo de los comandos anteriores:

* **mvn compile:** Es el paso más básico. Solo toma los archivos de código fuente y los compila para convertirlos en binarios. No corre pruebas ni genera ningún archivo final.
* **mvn package:** Este comando va un paso más allá. Primero compila el código, luego ejecuta todas las pruebas unitarias para revisar que nada esté roto, y si todo sale bien, guarda el proyecto en un archivo comprimido ejecutable dentro de la carpeta target.
* **mvn install:** Hace todo lo anterior y además toma ese archivo .jar resultante y lo copia en la carpeta de Maven de nuestra computadora. Esto sirve por si tenemos otros proyectos en la misma máquina que necesiten usar este código como una librería.

---

### 08. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

Aunque ambas sirven para definir contratos en el código, se diferencian en lo siguiente:

* **Herencia:** Una clase en Java solo puede heredar de una sola clase abstracta pero esa misma clase puede implementar todas las interfaces que necesite.
* **Atributos y estado:** En una interfaz no se pueden tener variables comunes, solo constantes. En cambio, una clase abstracta puede tener cualquier tipo de variable para guardar el estado del objeto.
* **Métodos con lógica:** La clase abstracta está pensada para tener una mezcla de métodos vacíos y métodos ya programados con lógica que las hijas van a heredar. La interfaz, por el contrario, está diseñada principalmente para definir solo los nombres de los métodos que las otras clases están obligadas a programar.
* **Enfoque:** Usamos una clase abstracta cuando los objetos son de la misma familia. Usamos una interfaz para dar una capacidad a clases que no tienen nada que ver entre sí.