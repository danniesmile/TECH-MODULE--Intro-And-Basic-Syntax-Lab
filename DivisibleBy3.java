import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program, which prints all the numbers from 1 to 100, which are divisible by 3.
        You have to use a single for loop.
        The program should not receive input.
        */

        for (int i = 3; i < 100; i+=3) {
            System.out.println(i);
        }
    }
}
