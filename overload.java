public class overload{
    public static void main (String[]args){
        String Name = "Dharshan raj";
        String Class = "Third year";
        int sem = 6;
        double CGPA =7.33;
        Mydetails (Name,Class,sem,CGPA);
    }
    public static void Mydetails(String Name,String Class,int sem,double CGPA){
    System.out.println("My Name is : " + Name );
    System.out.println("My Class is : " + Class );
    System.out.println("My Sem is : " + sem );
    System.out.println("My CGPA is : " + CGPA );
    }
}