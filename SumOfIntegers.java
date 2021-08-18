import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total numbers in array!!!");
        int n = scan.nextInt();
        int[] array=new int[n];
        System.out.println("Elements in the array : ");

        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
           // System.out.println(array[i]);
        }
        Triples(array,n);

    }
    static void Triples(int[] arr, int n)
    {
        boolean flag = false;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        flag = true;
                    }
                }
            }
        }


        if (flag == false)
            System.out.println(" not exist ");

    }
}
