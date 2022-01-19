import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);

        System.out.print("Введите число: ");
        int str = sw.nextInt();

        if (str>=100)
            System.out.println("less");
        else
            System.out.println("not less");
    }
}
