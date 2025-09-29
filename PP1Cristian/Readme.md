# Práctica PP1 - Inverso de un número

## Datos
- **Nombre:** Cristian Pérez  
- **Carné:** FI24040741

---

## Fuentes consultadas
- Documentación oficial de Java: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html  
- Ejemplos de recursividad: https://www.geeksforgeeks.org/recursion-in-java/  
- StackOverflow y foros de programación: https://stackoverflow.com/

---

##La respuesta a la siguientes preguntas:

-¿Es posible implementar una solución equivalente pero de comportamiento iterativo?
-Sí se puede esto es como un ejemplo 

public static long invertirIterativo(long n) {
    long rev = 0;
    while (n > 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
    }
    return rev;
}

-¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?

-Usando el número de dígitos con Math.log10() para colocar cada dígito en su posición correcta.

-Convertir el número a String y aplicar recursión sobre la cadena.

-?Qué relación observa entre el algoritmo para invertir un número natural y las estrategias para pasar de una base numérica a otra?

-Que ambos algoritmos usan la técnica de división sucesiva y residuos.


