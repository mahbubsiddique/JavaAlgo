package MyAlgorithm;

public class ReverseInteger {

	public static void main(String[] args) {

        int num = 12345678, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }

        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversed);
    }

}
