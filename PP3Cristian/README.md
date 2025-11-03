# Práctica Programada 3 — Listas Doblemente Enlazadas Circulares

## Datos del estudiante

* **Nombre:** Cristian Pérez Soto
* **Carné:** FI24040741

## Entorno de desarrollo

* **Lenguaje:** Java SE 21
* **JDK:** 21 (LTS)
* **IDE utilizado:** NetBeans IDE 27

## Páginas consultadas

* [GeeksforGeeks — Doubly Circular Linked List](https://www.geeksforgeeks.org/doubly-circular-linked-list-set-1-introduction-and-insertion/)
* [Stack Overflow — Implementing Circular Doubly Linked Lists in Java](https://stackoverflow.com/questions/38043170/implementing-a-doubly-circular-linked-list-in-java)
* [Oracle Java Documentation — Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
* [Baeldung — Java Generics Tutorial](https://www.baeldung.com/java-generics)

---

## Preguntas teóricas

### 1️ Si tuviera que implementar una estructura tipo **Cola (Queue)**, ¿qué tipo de lista utilizaría y por qué?

Utilizaría una **lista simplemente enlazada** o una **lista circular**.
La razón es que en una cola los elementos se agregan al final y se eliminan al inicio, por lo que no es necesario recorrer hacia atrás.
Una lista circular permite conectar el último elemento con el primero, lo cual facilita manejar la estructura sin necesidad de punteros nulos y hace más eficiente el acceso en operaciones repetitivas.

---

### 2️ ¿Cuál podría ser una ventaja y una desventaja de usar una lista creada manualmente en lugar de las de Java (como `ArrayList` o `LinkedList`)?

* **Ventaja:**
  Permite tener control total sobre la estructura interna, optimizar el comportamiento según las necesidades del programa y entender mejor cómo funcionan las listas dinámicas en memoria.

* **Desventaja:**
  Requiere más tiempo de desarrollo y pruebas. Además, las implementaciones estándar de Java son más seguras, optimizadas y probadas para múltiples escenarios, por lo que suelen ser más confiables y eficientes para uso general.

---

