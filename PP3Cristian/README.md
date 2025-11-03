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

Usaría una lista simplemente enlazada o una lista circular, ya que en una cola las operaciones principales son insertar al final y eliminar al inicio, sin necesidad de recorrerla en sentido inverso. La lista circular tiene la ventaja de enlazar el último nodo con el primero, evitando el uso de referencias nulas y permitiendo un manejo más continuo y eficiente de los elementos.

---

### 2️ ¿Cuál podría ser una ventaja y una desventaja de usar una lista creada manualmente en lugar de las de Java (como `ArrayList` o `LinkedList`)?

* **Ventaja:**
  Brinda un control completo sobre la estructura interna, permitiendo optimizar su comportamiento según las necesidades del programa y comprender en profundidad cómo funcionan las listas dinámicas en memoria.

* **Desventaja:**
  Exige más tiempo de desarrollo y pruebas. Además, las implementaciones estándar de Java son más seguras, están mejor optimizadas y han sido ampliamente probadas, por lo que resultan más confiables y eficientes para la mayoría de los casos de uso.

---

