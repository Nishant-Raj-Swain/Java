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


        System.out.print("\n");

        //reverse order

        System.out.print("Reverse order : ");
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\n");

        //length of array
        System.out.println("Array length : "+ arr.length);




    }

}