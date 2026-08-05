import java.util.*;
class copyarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        
        System.out.print("arr1 = ");
        for(int i : arr1){
            System.out.print(i+" ");
        }


        System.out.print("\n");


        // add elements

        int sum=0;
        for(int x : arr){
            sum +=x;
        }
        System.out.println("Sum of Ele in arr = "+sum);


        //Avg 
        float avg = sum/arr.length;
        System.out.println("Avg of Ele in arr = "+ avg);

    }
}