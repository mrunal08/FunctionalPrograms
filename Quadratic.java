import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c !!!");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta=(Math.pow(b,2))-(4*a*c);
        System.out.println(delta);

        if(delta>0){
            double root1=(-b + (Math.sqrt(delta)))/(2*a);
            double root2=(-b - (Math.sqrt(delta)))/(2*a);
            System.out.println("Root 1 : "+root1);
            System.out.println("Root 2 : "+root2);
        }
        else{
            System.out.println("Do not exist");
        }

    }
}