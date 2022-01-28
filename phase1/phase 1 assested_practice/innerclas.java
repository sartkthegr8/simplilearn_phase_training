abstract class InnerClass
{
    public abstract void display();
}
public class innerclas {

    public static void main(String[] args) {

        InnerClass i = new InnerClass() {
            public void display() {

                System.out.println("Anonymous Inner Class");
            }
        };

        i.display();
    }
}