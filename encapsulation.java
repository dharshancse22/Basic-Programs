package basicprogram;
class demo{
    private String name = "Dharshan raj";
    private int age =40;
    private int marks =99;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getMarks(){
        return marks;

    }

    public void setMarks(int marks) {
        this.marks = marks;

    }
}
public class encapsulation {
    public static void main(String[] args) {
        demo obj =new demo();
        obj.setName("Dharshan");
        obj.setAge(22);
        obj.setMarks(89);
        System.out.println(" Name is "+ obj.getName());
        System.out.println(" Age is "+ obj.getAge());
        System.out.println(" Mark is "+ obj.getMarks());


    }
}