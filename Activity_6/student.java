package Aanand_n01712678.Activity_6;

public class student {
    int id;
    String name;
    static int count;

    public student (int id, String name){
        this.id=id;
        this.name=name;
        count++;
    }
    public student(){
        count++;
    }

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        Example example = new Example();
        example.createstudent();
        System.out.println("Number of Instance : " + count);
    }
}
