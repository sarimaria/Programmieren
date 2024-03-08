package Hausuebungen;
import java.util.Scanner;
public class HausuebungBsp8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte positive ganze Zahl eingeben:");
        int nummer = scanner.nextInt();
        int sum = 0;
        for (int i=0; i <= nummer; i++) { //i ist der zähler
                                        // solange der zähler kleiner gleich die eingegebene nummer ist,
                                         // soll die for schleife laufen und i addiert werden
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
