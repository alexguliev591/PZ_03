import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);

        System.out.print("Введите число: ");
        int str = sw.nextInt();

        if (str>=0&& str<=50) {
            System.out.println("F");
        }
        else if (str>=51&&str<=70) {
            System.out.println("D");
        }
        else if (str>=71&&str<=80) {
            System.out.println("C");
        }
        else if (str>=81&&str<=90) {
            System.out.println("B");
        }
        else if (str>=91&&str<=100) {
            System.out.println("A");
        }
        }
    }
