import java.util.Random;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        System.out.println("Лабораторна робота №2 \nВиконав: Боднар Андрій");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведіть кількість рядків: ");
        int rows = scan.nextInt(); // кількість рядків
        System.out.print("Введіть кількість стовпців: ");
        int columns = scan.nextInt(); // кількість стовпців
        System.out.print("Введіть тип значень: від 0 до ");
        double power = scan.nextInt();
        double[][] matrix = new double[rows][columns];

        Random random = new Random();

        // Створення матриці
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextDouble()*(power+1);
            }
        }
        // Виведення матриці
        System.out.println("\nСтворена матриця:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%3.4f ", matrix[i][j]);
            }
            System.out.println();
        }
        // Транспонування матриці
        double[][] transposed_matrix = new double[columns][rows];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                transposed_matrix[j][i] = matrix[i][j];
            }
        }
        // Виведення транспонованої матриці
        System.out.println("\nТранспонована матриця:\n");
        for(int i=0; i<columns; i++) {
            for(int j=0; j<rows; j++) {
                System.out.printf("%3.4f ", transposed_matrix[i][j]);
            }
            System.out.println();
        }
        // Знаходження середнього значення усіх елементів матриці
        int sum = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                sum += matrix[i][j];
            }
        }
        double average = (double) sum / (rows * columns);

        // Виведення середнього значення
        System.out.printf("\nСереднє значення елементів матриці: %3.4f\n", average);
    }
}
