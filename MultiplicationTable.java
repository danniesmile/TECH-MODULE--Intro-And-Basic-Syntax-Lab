import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* You will receive an integer as an input from the console. Print the 10 times table for this integer.
        Output - Print every row of the table in the following format:
        {theInteger} X {times} = {product}
        Constraints - The integer will be in the interval [1…100] */

        int num = Integer.parseInt(scanner.nextLine());
        int product = 0;
        int times = 0;

        for (int i = 1; i <= 10; i++) {
            product = num * i;
            times++;
            System.out.println(num + " " + "X" + " " + times + " " + "=" + " " + product);
        }
    }
}
