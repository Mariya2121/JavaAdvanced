package Example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Maria",20);
        int age = 50;
        System.out.println(person);
        changeName(person);
        System.out.println(person);

        System.out.println(age);
        changeAge(age);
        System.out.println(age);

        String string = new String("Something");

        System.out.println(string);
        getString(string);
        System.out.println(string);


    }
    int max = Integer.MAX_VALUE; // static field and all instances have the same value
    //Integer integer = new Integer();


//    new Integer(); boxer class for int;It adds additional functionalities(min, max, sum, average)

    // примитивни типове -
    // референтни - String is reference type, but it is immutable.It means once we assigned a value, it cannot be change; Array, Objects, List


    public static void changeName(Person person){ // pass by reference; можем да променяме само полетата
        person.name = "Iva";
        person = new Person("Ivana", 23); //не работи,защото поинтъра сам по себе си е нереферентен тип
    }
    public static void changeAge(int age){ // pass by value
        age += 50;

    }
    public static void getString(String string){
        string += "Smth";
    }
}
