import java.util.*;
import javax.swing.text.GapContent;
class Arrayclass{
    public static void main(String []args){
        int arr1[] = new int[]{10,20,30,40,50};
        int arr2[] = new int[]{10,20,30,40,50};

    

        //Arrays.equals()

        System.out.println(Arrays.equals(arr1,arr2));

        // ==

        System.out.println(arr1 == arr2);



        //Another e.g(if arr len diff)

        int z[] = new int[6];
        int m[] = new int[7];
         
         System.out.println(Arrays.equals(z,m));



         System.out.print("\n ");


        //Arrays.sort()
        int x[] = new int[]{23,18,75,12,9};


        Arrays.sort(x);

        System.out.print("Sorted Array : ");

         for(int i:x){
            System.out.print(i+" ");
        }


        System.out.print("\n ");

        //Arrays.copyof()

        int k[] = new int[]{23,18,75,12,9};
        int y[];

        y = Arrays.copyOf(k,5);


         System.out.print("Print y :  ");

        for(int i:y){
            System.out.print(i+" ");
        }


        
    }
}