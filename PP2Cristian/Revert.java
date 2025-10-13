import java.io.*;
import java.util.Stack;

public class Revert {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        Stack<Character> stack = new Stack<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                stack.push((char) ch);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                while (!stack.isEmpty()) {
                    writer.write(stack.pop());
                }
            }

            System.out.println("El archivo se genero con exito: " + outputFile);

        } catch (IOException e) {
            System.out.println("error al procesar los archivos: " + e.getMessage());
        }
    }
}