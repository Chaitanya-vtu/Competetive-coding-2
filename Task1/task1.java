import java.util.Scanner;


public class Chaitanya {
   public static void main(String[] args) {
       System.out.print("Enter a number: ");import java.util.Scanner;


public class Chaitanya {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = squareRoot(n);
        System.out.println("The square root of " + n + " is: " + sqrt);
        sc.close();
    }import java.util.Scanner;


public class Chaitanya {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = squareRoot(n);
        System.out.println("The square root of " + n + " is: " + sqrt);
        sc.close();
    }


    public static int squareRoot(int num) {
        if (num == 0 || num == 1) return num;


        double sqrtroot = num / 2.0;
        double t;
        double epsilon = 1e-7;


        do {
            t = sqrtroot;
            sqrtroot = (t + num / t) / 2.0;
        } while (Math.abs(t - sqrtroot) > epsilon);


        return (int) sqrtroot; // return integer part of sqrt
    }
}




    public static int squareRoot(int num) {
        if (num == 0 || num == 1) return num;


        double sqrtroot = num / 2.0;
        double t;
double epsilon = 1e-7;


        do {
            t = sqrtroot;
            sqrtroot = (t + num / t) / 2.0;
        } while (Math.abs(t - sqrtroot) > epsilon);


        return (int) sqrtroot; // return integer part of sqrt
    }
}


       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sqrt = squareRoot(n);
       System.out.println("The square root of " + n + " is: " + sqrt);
       sc.close();
   }


   public static int squareRoot(int num) {
       if (num == 0 || num == 1) return num;


       double sqrtroot = num / 2.0;
       double t;
       double epsilon = 1e-7;


       do {
           t = sqrtroot;
           sqrtroot = (t + num / t) / 2.0;
       } while (Math.abs(t - sqrtroot) > epsilon);


       return (int) sqrtroot; // return integer part of sqrt
   }
}
