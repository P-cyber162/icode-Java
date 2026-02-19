import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius=2;
        double area, circumferece
        
        System.out.println("========AREA OF A CIRCLE=========");
        System.out.println("==========================");
        System.out.println(); 
        System.out.println("Enter the radius of the circle: ");    
        radius = input.nextInt();
        area = Math.PI*radius*radius;
        circumferece = 2*Math.PI*radius;

        System.out.println("====CIRCUMFERENCE OF THE CIRLCE=====");
        System.out.println("====================================");
        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumferece);

        input.close();
    }
};
