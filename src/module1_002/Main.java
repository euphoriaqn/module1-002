package module1_002;
import java.util.Scanner;
/**
 * Created by Илья on 29.06.2017.
 */
public class Main {
    public static void main (String[] args) {
        ////////////////////////////////////////////////
        ////////////////* USER DATA INPUT*//////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.next();
        System.out.println("Please enter city of your residence: ");
        String city = sc.next();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your hobby: ");
        String hobby = sc.next();
        ////////////////////////////////////////////////
        int variant;
        do {
            System.out.println("Enter variant of output: 1 - tabular, 2 - text, 3 - alternative");
            variant = sc.nextInt();
        } while (variant < 1 || variant > 3);
        ////////////////////////////////////////////////
        switch (variant) {
            case 1:
            tabularVar(name, city, age, hobby);
                break;
            case 2:
            textVar(name, city, age, hobby);
                break;
            case 3:
            alternatVar(name, city, age, hobby);
        }
    }
        //////////////*OUTPUT OF USER INPUT*//////////
        ///Tabular variant
        public static void tabularVar(String name, String city, int age, String hobby) {
            System.out.println("!!!Variant #1!!! ");
            System.out.println("Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Age: " + age);
            System.out.println("Hobby: " + hobby);
        }
        ///////////////////////////////////////////////
        ///Text variant
        public static void textVar(String name, String city, int age, String hobby) {
            System.out.println("!!!Variant #2!!! ");
            System.out.println("A human named " + name + " lives in the city of " + city + ".");
            System.out.println("This person is " + age + " years old and he/she loves " + hobby);
        }
        ///////////////////////////////////////////////
        ///Alternative variant
        public static void alternatVar(String name, String city, int age, String hobby) {
            System.out.println("!!!Variant #3!!! ");
            System.out.println(name + " - name");
            System.out.println(city + " - city");
            System.out.println(age + " - age");
            System.out.println(hobby + " - hobby");
        }
    }