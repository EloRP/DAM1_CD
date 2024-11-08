import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entrada;
        double sumaValoresPositivos = 0;
        double numPositivos = 0;
        double numNegativos = 0;
        double sumaValoresNegativos = 0;
        System.out.println("Introduce una serie de números. Introduce el 0 para salir.");
        entrada = sc.nextInt();

        while (entrada != 0) {
            if (entrada > 0) {
                sumaValoresPositivos += entrada;
                numPositivos++;
            } else if (entrada < 0) {
                sumaValoresNegativos += entrada;
                numNegativos++;
            }
            entrada = sc.nextInt();
        }
        sc.close();

        System.out.println("La media de los números positivos es de " + (sumaValoresPositivos / numPositivos));
        System.out.println("La media de los números negativos es de " + (sumaValoresNegativos / numNegativos));

    }
}

/*
 * if (numPositivos > 0) {
 * System.out.println("La media de los números positivos es de " +
 * (sumaValoresPositivos / numPositivos));
 * } else if (numNegativos > 0) {
 * System.out.println("La media de los números negativos es de " +
 * (sumaValoresNegativos / numNegativos));
 * }
 */