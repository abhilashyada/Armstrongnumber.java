import java.util.Scanner;
public class Armstrongnumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (isarmstrong(number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
    private static boolean isarmstrong(int number) {
        int orginalnumber = number;
        int sum = 0;
        int numberOfdigits = String.valueOf(number).length();
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfdigits);
            number /= 10;
        }
        return sum == orginalnumber;
    }
}