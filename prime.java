public class prime {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            isprime(i);
        }
    }
    public static void isprime(int n){
         int count = 0;
         for(int i =2; i<n;i++){
            if(n%i == 0){
            count ++;   
            }
            
         }
        if(count == 0){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + "is not a prime number");
        }

    }
    
}
