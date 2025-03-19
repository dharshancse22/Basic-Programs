package basicprogram;


abstract class employee{
    abstract void display();
    void show(){
        System.out.println("AAbstraction class is here");
    }
}
class servent extends employee {

    void display()
    {
        System.out.println(" Abstract   here ");

    }
}

public class abstractiondemo {
    public static void main(String[] args) {


        servent obj = new servent();
        obj.display();
        obj.show();
    }
}
