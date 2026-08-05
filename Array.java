import java.util.*;
class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter Elements of array : ");
        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Array is : ");
        for(int k : arr){
            System.out.print(k+" ");
        }


    }

}