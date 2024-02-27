import java.util.Scanner;

public class TemperatureConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Formula: (°C × 9/5) + 32 = °F
        System.out.print("Please input degrees in Celsius: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * (9/5f)) + 32f;
        System.out.println("Temperature in Fahrenheit: " + tempF);

    }
}
