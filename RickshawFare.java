import java.util.Scanner;

public class RickshawFare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseFare = 50;
        double perKm = 20;
        double perMinute = 2;

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is customer local? (true/false): ");
        boolean isLocal = sc.nextBoolean();

        System.out.print("Is it night travel? (true/false): ");
        boolean isNight = sc.nextBoolean();

        double fare = baseFare + (distance * perKm) + (time * perMinute);

        double discount = (isLocal && distance > 10) ? fare * 0.10 : 0;

        double surcharge = isNight ? 50 : 0;

        double totalFare = fare - discount + surcharge;

        System.out.println("Final Fare: Rs. " + totalFare);

        sc.close();
    }
}