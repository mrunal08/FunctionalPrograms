import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of temperature in Fahrenheit!!!");
        int t = scan.nextInt();

        System.out.println("Enter the value of wind speed in miles per hour!!!");
        int v = scan.nextInt();

        if(t<50 && v>=3 && v<=120){
            double w=35.74+(0.6215*t)+((0.4275*t)-35.75)*(Math.pow(v,0.16));
            System.out.println("Value of Wind Chill : "+ w);
        }
        else{
            System.out.println("Values not in correct range which make formula invalid!!!");
        }



    }
}