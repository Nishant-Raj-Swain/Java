import java.util.Arrays;
import java.util.Scanner;
class largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of arr : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

         System.out.print("Array Elements are : ");
         for(int i : arr){
             System.out.println(i+" ");

         }

          //largest element
          int max = arr[0];

          for(int k : arr){
            if (k>max){
                max=k;
            }
        }

            System.out.println("largest element is : "+max);



    }

}