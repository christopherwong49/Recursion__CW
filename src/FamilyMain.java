import java.util.ArrayList;
import java.util.Scanner;

public class FamilyMain {

    public static void run() {
        //generation 0
        Person person1 = new Person("Bobbie", "Mexico");
        //generation 1
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Belise"));
        //generation 2
        person1.children.get(0).addChild(new Person("Zain", "Belise"));

        person1.children.get(1).addChild(new Person("Chris", "Canada"));
        person1.children.get(1).addChild(new Person("Tian", "China"));
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
        //generation 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(1).children.get(1).addChild(new Person("Natalie", "Japan"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

        //generation 4
        person1.children.get(1).children.get(1).children.get(0).addChild(new Person("Adrian", "Spain"));

        printFamily(person1);
        printCanadians(person1);

        System.out.print("The number of people in " + person1.name + "'s family is:  ");
        System.out.println(countFamily(person1));

        Scanner input = new Scanner(System.in);
        printFromHere(findPerson(person1, input.nextLine()));
    }

    public static void printFamily(Person ptemp){
        System.out.println(ptemp.name);
        for (int i = 0; i < ptemp.children.size(); i++) {
            printFamily(ptemp.children.get(i));
        }
    }

    public static int countFamily(Person ptemp){
        if(ptemp.children.isEmpty()){
            return 1;
        } else{
            int num = 0;
            for (int i = 0; i < ptemp.children.size(); i++) {
                num += countFamily(ptemp.children.get(i));
            }
            return 1 + num;
        }
    }


    public static void printCanadians(Person ptemp){
        if(ptemp.country.equals("Canada")) {
            System.out.println(ptemp.name);
        }
        for (int i = 0; i < ptemp.children.size(); i++) {
            printFamily(ptemp.children.get(i));
        }
    }

    public static void printFromHere(Person ptemp){
        printFamily(ptemp);
    }

    public static Person findPerson(Person ptemp, String name){
        if(ptemp.name.equals(name)){
            return ptemp;
        }

        Person found = null;
        for (int i = 0; i < ptemp.children.size(); i++) {
            found = findPerson(ptemp.children.get(i), name);
            if(found != null){
                return found;
            }
        }
        return null;
    }
}//class