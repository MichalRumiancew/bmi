import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Podaj twoj wzrost w Cm: ");

        double wzrost = userInput.nextInt();

        System.out.print("Podaj twoja mase ciala w Kg: ");

        double masa = userInput.nextInt();

        double bmi = masa / Math.pow(wzrost, 2) * 10000;
        //m2=10000cm

        System.out.print("Twoje BMI wynosi: " );
        System.out.printf("%6.2f",bmi);



        if (bmi < 18.5) {
            System.out.print(" za chudy");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print(" Normalny");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print(" Nadwaga");
        } else if (bmi >= 30) {
            System.out.print(" otyłość");
        }


    }
}



