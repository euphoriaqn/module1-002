package module1_002;
import java.util.Scanner;
/**
 * Created by Илья on 29.06.2017.
 */
public class Main {
    public static void main (String[] args){
        ////////////////////////////////////////////////
        ////////////////* USER DATA INPUT*//////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String  name = sc.next();
        System.out.println("Please enter city of your residence: ");
        String  city = sc.next();
        System.out.println("Please enter your age: ");
        int  age = sc.nextInt();
        System.out.println("Please enter your hobby: ");
        String  hobby = sc.next();
        ///////////////////////////////////////////////
        //////////////* OUTPUT OF USER INPUT*//////////
        System.out.println("!!!Variant #1!!! ");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        ///////////////////////////////////////////////
        System.out.println("!!!Variant #2!!! ");
        System.out.println("A human named " + name + " lives in the city of " + city + ".");
        System.out.println("This person is " + age + " years old and he/she loves " + hobby);
        ///////////////////////////////////////////////
        System.out.println("!!!Variant #3!!! ");
        System.out.println(name + " - name");
        System.out.println(city + " - city");
        System.out.println(age + " - age");
        
    }
}
