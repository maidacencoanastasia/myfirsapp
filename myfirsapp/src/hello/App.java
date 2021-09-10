package hello;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int an = 2021;
        System.out.println("Hello, world!");
        System.out.println("Today is " + an);
        String firstname;
        String secondname;
        Scanner name = new Scanner(System.in);
        System.out.print("Numele vostru ");
        firstname = name.next();
        System.out.print("Prenumele vostru ");
        secondname = name.next();
        System.out.print("Salut creatorule "+ firstname+" "+ secondname+" !" );
    }
}
