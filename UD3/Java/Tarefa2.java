import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[10];
        double sumanotas = 0;
        double media_mayor = 0;
        double media_menor = 10;
        System.out.println("Introduce las notas de las 10 asignaturas.");
        for (int j = 0; j < notas.length; j++) {
            System.out.print("Nota " + (j + 1) + ":");
            notas[j] = sc.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media_mayor) {
                media_mayor = notas[i];
            } else if (notas[i] < media_menor) {
                media_menor = notas[i];
            }
            sumanotas += notas[i];
        }
        sc.close();
        System.out.println("Media: " + sumanotas / notas.length);
        System.out.println("Media mayor: " + media_mayor);
        System.out.println("Media menor: " + media_menor);
    }
}
