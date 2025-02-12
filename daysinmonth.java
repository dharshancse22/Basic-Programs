import java.util.Scanner;
public class daysinmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1 to 12): ");
        int Month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int Year = scanner.nextInt();
        int daysinmonth = 0;

        switch (Month) {
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
           daysinmonth = 31;
           break;
           case 4: case 6: case 9: case 11:
           daysinmonth = 30;
           case 2:
           if((Year % 4 == 0 && Year % 100 != 0)|| Year % 400 == 0){
           daysinmonth = 29;
           }
           else 
           {
           daysinmonth = 28;
           }
           break;
        
        }
        System.out.println("The Month is "+ Month + " Year is " + Year + " has " + daysinmonth + " days");

    }
    
}
