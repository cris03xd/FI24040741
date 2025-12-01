# Caso Práctico 2 — Recuperación de Información Textual

## **Estudiante**
- **Nombre:** Cristian Pérez Soto  
- **Carné:** FI24040741  

---

## **Entorno de desarrollo**
- **Lenguaje:** Java SE 21  
- **JDK:** 21  
- **IDE utilizado:** NetBeans IDE 27(compatible con Ant)  

---

## **Páginas web consultadas**

Estas páginas fueron utilizadas únicamente para repasar conceptos teóricos relacionados con las estructuras de datos solicitadas:

- Definición de cola (Queue):  
  https://en.wikipedia.org/wiki/Queue_(abstract_data_type)

- Concepto FIFO:  
  https://en.wikipedia.org/wiki/FIFO_(computing_and_electronics)

- Definición de pila (Stack):  
  https://en.wikipedia.org/wiki/Stack_(abstract_data_type)

- Listas enlazadas:  
  https://en.wikipedia.org/wiki/Linked_list

- Árbol binario de búsqueda (BST):  
  https://en.wikipedia.org/wiki/Binary_search_tree

- Matriz de adyacencia (Grafos):  
  https://en.wikipedia.org/wiki/Adjacency_matrix

Estos enlaces se utilizan como referencia conceptual, y se incluyen también como comentarios dentro del código, tal como indica el enunciado.

---


## **Descripción del proyecto**

Este caso práctico implementa un sistema de **recuperación de información textual** utilizando varias estructuras de datos personalizadas:

- **CustomQueue** → almacena índices donde aparece cada palabra.  
- **CustomStack** → agrupa palabras con el mismo *Term Frequency*.  
- **CustomTree** → árbol binario de búsqueda ordenado por TF.  
- **CustomGraph** → matriz de adyacencia para caracteres consecutivos.  

El programa:

1. Lee un archivo `input.txt`.
2. Limpia el texto (minúsculas, sin tildes ni signos).
3. Genera:
   - **clean.txt** — texto limpio.
   - **map.txt** — palabras con su cola de posiciones.
   - **tree.txt** — TF ordenado usando un árbol binario.
   - **matrix.csv** — matriz de adyacencia de caracteres.
4. Muestra en consola:

Length (words): X
