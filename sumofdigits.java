public class sumofdigits {
    public static void main(String[] args) {
        int n = 12345;
        int rem;
        int sum= 0;
        do {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        while (n != 0);
        System.out.println("The sum of the digit is " + sum);
    }
    
}
