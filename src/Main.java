import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextInt();
        second = scanner.nextInt();
        Compare.compare(first, second);
    }
}


   //     Напишите программу, которая сравнивает 2 числа
