package sample;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        System.out.println("Choose temperature conversion you want to perform: Celsius or Fahrenheit: ");
        String temperatureOption = scanner.next().toLowerCase();
        if (temperatureOption.equals("fahrenheit")){
            System.out.println("Enter degree for Celsius: ");
            celsius = scanner.nextDouble();
            System.out.println(fahrenheitConverter(celsius)+"F");
        } else if (temperatureOption.equals("celsius")){
            System.out.println("Enter degree for Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            System.out.println(celsiusConverter(fahrenheit)+"C");
        }
        else {
            System.out.println("that conversion is not ready.");
        }



    }

    private static double fahrenheitConverter(double celsius) {
        return celsius* ((double) 9 /5) + 32;

    }

    private static double celsiusConverter(double fahrenheit) {
        return (fahrenheit - 32) *((double) 5 / 9);
    }
}
