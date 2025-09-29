public class Inverso {

    public static int invertir(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int resto = numero % 10;
            int cociente = numero / 10;
            int digitos = (int) Math.log10(numero);
            return (int) (resto * Math.pow(10, digitos)) + invertir(cociente);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java Inverso <numero>");
            return;
        }

        int numero = Integer.parseInt(args[0]);

        int resultado = invertir(numero);

        System.out.println(numero + " -> " + resultado);
    }
}
