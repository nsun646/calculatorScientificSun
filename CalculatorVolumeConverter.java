import java.util.Scanner;

public class CalculatorVolumeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        double volume = scanner.nextDouble();

        System.out.print("Choose an unit!! 1.)mL, 2.)L, 3.)cm^3, 4.)m^3, 5.)tsp, 6.)tbsp, 7.)fl oz, 8.)c, 9.)pt, 10.)qt, 11.)gal, 12.)in^3, 13.)ft^3: ");
        int unit = scanner.nextInt();

        System.out.print("Choose an unit to convert to!! 1.)mL, 2.)L, 3.)cm^3, 4.)m^3, 5.)tsp, 6.)tbsp, 7.)fl oz, 8.)c, 9.)pt, 10.)qt, 11.)gal, 12.)in^3, 13.)ft^3: ");
        int convUnit = scanner.nextInt();
        System.out.println("Converted Volume: " + Converter.converter(volume, unit, convUnit));

        scanner.close();
    }
}


