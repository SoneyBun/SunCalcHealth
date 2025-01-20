import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Main {
    static double h, w;
    static double bmi;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                URI uri = new URI("https://www.unitconverters.net");
                desktop.browse(uri);
            } else {
                System.out.println("Desktop is not supported on this system.");
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        System.out.print("Height (Inches): ");
        h = Double.parseDouble(scan.nextLine());

        System.out.print("Weight (Pounds): ");
        w = Double.parseDouble(scan.nextLine());

        bmi = (w/Math.pow(h, 2)) * 703;

        System.out.println("BMI (Body Mass Index): " + bmi + "\nWeight Class: " + weightClass(bmi) + "\n");
    }

    public static String weightClass(double bmi) {
        if(bmi < 18.5) {
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25) {
            return "Normal";
        }
        else if(bmi >= 25 && bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}