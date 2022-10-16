import java.util.Scanner;

public class main3 {

    public static void main(String[] args ){

        double a,b,hip;

        Scanner gir = new Scanner(System.in);

        System.out.print("a kenarini giriniz :");

        a = gir.nextDouble();

        System.out.print("b  kenarini giriniz :");

        b = gir.nextDouble();

        a =a*a;

        b =b*b;

        hip = Math.sqrt(a+b);

        System.out.println("hipotenus :" + hip);






    }
}
