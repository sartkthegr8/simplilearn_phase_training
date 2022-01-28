class EmpInfo{
    int id=123456;
    String name= "sarthak";

    void display() {
        System.out.println(id+" "+name);
    }
}

public class constructor {

    public static void main(String[] args) {

        EmpInfo emp1=new EmpInfo();
        EmpInfo emp2=new EmpInfo();

        emp1.display();
        emp2.display();
    }
}

