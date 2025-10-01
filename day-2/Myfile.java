import java.util.Scanner;

class Myfile {
    public static void main(String[] args) {
        float b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();

        System.out.println("Enter height");
        b = sc.nextFloat();

        System.out.println("Enter double value");
        double c = sc.nextDouble();

        System.out.println("Enter name");
        String d = sc.next();

        // Print the entered values to verify
        System.out.println("Entered number: " + a);
        System.out.println("Entered height: " + b);
        System.out.println("Entered double value: " + c);
        System.out.println("Entered name: " + d);

        // Close the scanner
        sc.close();
    }
}