import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfThePerson = Integer.parseInt(scanner.nextLine());
        int priceInDollars = 0;

        switch (typeOfDay) {
            case "Weekday":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    priceInDollars += 12;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 18 && ageOfThePerson <= 64) {
                    priceInDollars += 18;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 64 && ageOfThePerson <= 122) {
                    priceInDollars += 12;
                    System.out.println(priceInDollars + "$");
                } else {
                    System.out.println("Error!");
                }
                break;

            case "Weekend":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    priceInDollars += 15;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 18 && ageOfThePerson <= 64) {
                    priceInDollars += 20;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 64 && ageOfThePerson <= 122) {
                    priceInDollars += 15;
                    System.out.println(priceInDollars + "$");
                } else {
                    System.out.println("Error!");
                }
                break;

            case "Holiday":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    priceInDollars += 5;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 18 && ageOfThePerson <= 64) {
                    priceInDollars += 12;
                    System.out.println(priceInDollars + "$");
                } else if (ageOfThePerson > 64 && ageOfThePerson <= 122) {
                    priceInDollars += 10;
                    System.out.println(priceInDollars + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
        }
    }
}
