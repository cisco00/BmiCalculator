import java.util.Scanner;
//measuring the body weight of individual
public class BodyMass { //declaring the class

    public static void main(String[] args) { //the main method begins here

        Scanner input = new Scanner(System.in); //importing scanner

        //declaring variables

        System.out.print("Enter weight! ");
        double weight = input.nextDouble();

        System.out.print("Enter height! ");
        double height = input.nextDouble();

        double bodMass = weight / height * height;
        ;

        System.out.println(bodMass);
    }
}
