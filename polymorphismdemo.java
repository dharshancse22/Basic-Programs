package basicprogram;
class example{
    int num1;
    int num2;
    int result;
    void sum (int a,int b){
        num1=a;
        num2=b;
        result =num1+num2;
        System.out.println("The sum is : " + result);
    }
    void sum(double a, double b){
        num1=(int)a;
        num2=(int)b;
        result=num1+num2;
        System.out.println("The sum is : "+result);
    }
    void sum(int a, double b){
        num1=a;
        num2=(int)b;
        result=num1+num2;
        System.out.println("The sum is : "+result);
    }
}
public class polymorphismdemo {
    public static void main(String[] args) {


        example obj = new example();
        obj.sum(10, 20);
        obj.sum(10.0,25.0);
        obj.sum(20,20.0);
    }
}