import java.util.Scanner;

class odd_1ton{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
   


        for(int i =1; i<n; i+=2){
            System.out.print(i+" ");
        }
    }
}