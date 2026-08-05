import java.util.*;
class arrsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr : ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter elements : ");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.print("\n");

        //Acsending sort

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){

                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.print("Ascending sorted arr : ");
        for(int k : arr){
            System.out.print(k+" ");
        }

        System.out.print("\n"); 

        //Descending sort
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Descending sorted arr : ");
        for(int k : arr){
            System.out.print(k+" ");
        }




    }
}