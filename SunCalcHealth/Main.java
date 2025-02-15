import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Main {
    static double h, h2, w, bmi;
    static boolean g;
    static int choice = -1;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Disclaimer
        System.out.println("Do NOT make medical decisions based off of any information given from this calculator. This is nothing but a coding project.");

        // Getting Users Measurement System
        System.out.print("Enter Measurement System (Metric/Imperial): ");
        char ems = scan.nextLine().toLowerCase().charAt(0);
        boolean ms = ems == 'm';

        // Opens UnitConverters.net
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

        // Loops
        while(choice != 0) {
            System.out.println("What would you like to do?\n(1) - Calculate Body Mass Index (BMI)\n(2) - Calculate Estimated Height");
            choice = Integer.parseInt(scan.nextLine());

            if(choice == 1) {
                calculateBMI(ms);
            } else {
                estimateHeight(ms);
            }
        }
    }

    public static void calculateBMI(boolean ms) {
        // Determining BMI Based Off Of Height And Weight In Both Measurement Systems
        if(ms) {
            System.out.print("Height (Meters): ");
            h = Double.parseDouble(scan.nextLine());
            System.out.print("Weight (Kilograms): ");
            w = Double.parseDouble(scan.nextLine());
            bmi = w / Math.pow(h, 2);
        } else {
            System.out.print("Height (Inches): ");
            h = Double.parseDouble(scan.nextLine());
            System.out.print("Weight (Pounds): ");
            w = Double.parseDouble(scan.nextLine());
            bmi = 703 * w / Math.pow(h, 2);
        }

        // Printing The Output According To The BMI
        if(bmi < 18.5) {
            System.out.println("BMI (Body Mass Index): " + bmi + "\nWeight Class: Underweight" + "\n");
        }
        else if(bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI (Body Mass Index): " + bmi + "\nWeight Class: Normal" + "\n");
        }
        else if(bmi >= 25 && bmi < 30) {
            System.out.println("BMI (Body Mass Index): " + bmi + "\nWeight Class: Overweight" + "\n");
        }
        else {
            System.out.println("BMI (Body Mass Index): " + bmi + "\nWeight Class: Obese" + "\n");
        }
    }

    public static void estimateHeight(boolean ms) {
        // Stores The Users Gender
        System.out.print("Enter Your Biological Gender (Male/Female): ");
        char eg = scan.nextLine().toLowerCase().charAt(0);
        g = eg == 'm';

        // Getting Parents Height And Printing According To Gender
        if(ms) {
            System.out.print("Mother's Height (Centimeters): ");
            h = Double.parseDouble(scan.nextLine());
            System.out.print("Father's Height (Centimeters): ");
            h2 = Double.parseDouble(scan.nextLine());

            if(g) {
                System.out.println("Estimated Height: " + ((h + h2 + 13)/2) + "cm.");
            } else {
                System.out.println("Estimated Height: " + ((h + h2 - 13)/2) + "cm.");
            }
        } else {
            System.out.print("Mother's Height (Inches): ");
            h = Double.parseDouble(scan.nextLine());
            System.out.println("Father's Height (Inches): ");
            h2 = Double.parseDouble(scan.nextLine());

            if(g) {
                System.out.println("Estimated Height: " + ((h + h2 + 5)/2) + "in.");
            } else {
                System.out.println("Estimated Height: " + ((h + h2 - 5)/2) + "in.");
            }
        }
    }
}
