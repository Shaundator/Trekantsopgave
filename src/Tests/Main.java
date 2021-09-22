package Tests;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangleTemp = new Triangle();
        int a=0;
        int b=0;
        int c=0;
        boolean repeat = true;
        while(repeat) {
            System.out.println("indtast a:"); a=sc.nextInt();
            System.out.println("indtast b:"); b=sc.nextInt();
            System.out.println("indtast c:"); c=sc.nextInt();
            if (!triangleTemp.validCheck(a, b, c)) {
                System.out.println("invalid triangle, try again");
                repeat = true;
            }
            else{
                System.out.println("Valid triangle");
                repeat = false;
            }
        }

        Triangle triangle = new Triangle(a, b, c);
        triangle.triangleType();
        System.out.println("to string\n");
        System.out.println(triangle);
        System.out.println(Math.max(5, 5));
    }
}
