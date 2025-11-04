# Práctica Programada 3 — Listas Doblemente Enlazadas Circular

## Datos del estudiante

* **Nombre:** Cristian Pérez Soto
* **Carné:** FI24040741

## Entorno de desarrollo

* **Lenguaje:** Java SE 21
* **JDK:** 21 
* **IDE utilizado:** NetBeans IDE 27

## Páginas consultadas

* Documentación oficial de Java (Oracle Docs):
Consultada para revisar la sintaxis y uso de clases genéricas y colecciones en Java.

* GeeksforGeeks:
Utilizada para reforzar la comprensión de cómo funcionan las listas doblemente enlazadas y sus operaciones.

* Stack Overflow:
Consultada para resolver dudas relacionadas con referencias circulares y el manejo de punteros en listas enlazadas.
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

