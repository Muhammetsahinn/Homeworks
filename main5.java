import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        double pi=3.14,r,a;

        Scanner grs= new Scanner(System.in);

        System.out.println("Dairenin yari capini giriniz");

        r = grs.nextDouble();

        System.out.println("a giriniz");

        a = grs.nextDouble();

        System.out.println("Dairenin alani :" +pi*r*r);

        System.out.println("Dairenin cevresi :" +2*pi*r);

        System.out.println("merkezi yari capin alanı :" + (pi*(r*r)*a)/360);




    }
}
