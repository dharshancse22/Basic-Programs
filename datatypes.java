import java.util.Scanner;
public class datatypes{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String container = scan.nextLine();
        int container2 = scan.nextInt();
        char container3 = scan.next().charAt(5);
        System.out.println("my name:"+container);
        System.out.println("my age is"+container2);
        System.out.println("my char is:"+container3);

        scan.close();
    }
}
