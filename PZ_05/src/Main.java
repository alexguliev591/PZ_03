public class Main {

    public static void main(String[] args) {
        Vet1(4.23);
        Vet1(0.93);
        System.out.println();
        Vet2(-3.16);
        Vet2(4.16);
        Vet2(1.78);
    }
        public static void Vet1 (double x)
        {
            double a = 1.1, b = 3.2;
            if (x <= 1)
                System.out.println(a * Math.pow(Math.sin(x), 2) + Math.sqrt(x));
            else
                System.out.println(b * Math.exp(Math.pow(x,2)));
        }
        public static void Vet2 (double x)
        {
            double a = 1.3, b = 2.5;
            if (x <= -2)
                System.out.println(2*Math.pow(Math.cos(a*x*x-b),2));
            else if (x > 3)
                System.out.println(3*Math.pow(x,2)+b);
            else if (x > -2 && x <= 3)
                System.out.println(Math.sqrt(Math.pow(x,2)+Math.exp(a*x)));
        }
    }
