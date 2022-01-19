import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sw = new Scanner(System.in);

        System.out.print("Введите число: ");
        int str = sw.nextInt();

        switch (str) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Это DEFAULT");
        }
    }
}