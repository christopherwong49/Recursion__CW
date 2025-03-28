import java.util.ArrayList;

public class Person {
    public String name;
    public String country;  //where they currently live
    public ArrayList <Person> children;

    public Person(String n, String c){
        name = n;
        country = c;
        children = new ArrayList();
    }
    public void addChild (Person p){
        children.add(p);

    }

}
