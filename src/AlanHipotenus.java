import java.util.Scanner;

public class AlanHipotenus {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen Üçgenin (a) Kenar Uzunluğunu Giriniz");
        double a= scan.nextDouble();

        System.out.println("Lütfen Üçgenin (b) Kenar Uzunluğunu Giriniz");
        double b= scan.nextDouble();

        double alan= (a*b)/2;
        double hipotenus= Math.sqrt((a*a)+(b*b));

        System.out.println("Dik Ücgeninizin Hipotenusu: "+hipotenus+ "\nÜçgeninizin Alan: "+alan);


    }
}
