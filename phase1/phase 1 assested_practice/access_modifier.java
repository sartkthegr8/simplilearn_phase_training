class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class access_modifier {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName(" my name is sarthak");
        System.out.println(d.getName());
    }
}