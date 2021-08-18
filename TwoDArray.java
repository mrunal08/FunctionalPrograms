import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Rows and Columns!!!");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int [][] table = new int[rows][columns];
        System.out.println("Enter The Elements in Rows and Columns!!!");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                table[i][j]=scan.nextInt();
                System.out.println(" "+table[i][j]+" ");

            }

        }

    }


}
