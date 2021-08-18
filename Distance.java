import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Distance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x !!!");
        int x = scan.nextInt();
        System.out.println("Enter the value of  y !!!");
        int y = scan.nextInt();

        double distance=Math.sqrt((Math.pow(x,2))+Math.pow(y,2));

        System.out.println("Distance from the point ("+x+","+y+") to the origin (0, 0) is : "+distance);
    }
}