import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        double num3 = getNumber();
        System.out.println("Các số sau khi sắp xếp: ");
        displaySortedNumbers(num1, num2, num3);
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        return scanner.nextInt();
    }

    private static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
