import java.util.*;
class search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.print("Enter Elements : ");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.print("\n");

        System.out.println("Enter key : ");
        int key = sc.nextInt();

        int count=0;

        for(int i=0; i<size; i++){

            if(key==arr[i]){
                System.out.println("Element present at pos : "+ (i+1));
                count++;
            }



        }
        if (count == 0){
            System.out.print("not Found");
        }


    }
}