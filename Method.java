//public class Method {
//    String type;
//    String name;
//    public Pokemon(String type, String name){
//        this.type = type;
//        this.name = name;
//    }
//    public static void main(String[] args) {
//        Pokemon something = new Pokemon("Electric", "pika");
//        System.out.println("I choose you " + something.name + "  my favorite type " + something.type);
//    }
//}

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}

import java.util.Scanner;


public class Method {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");


    }
}

