public class controlflow {
    public static void main(String[] args) {
        int studentmark = 90;
        if(studentmark==100) {
            System.out.println("You got O grade");
        }
        else if(studentmark >= 90 && studentmark <= 99)
        {
             System.out.println("you got A grade"); 
        }
        else if(studentmark >=80 && studentmark <= 89)
        {
            System.out.println("you got B grade");
    }
        else if (studentmark <= 50)
            System.out.println("you are fail"); 
    }
}
