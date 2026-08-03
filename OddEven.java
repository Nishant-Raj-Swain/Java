import java.util.Scanner;
class OddEven{

    OddEven(int x){
        if (x%2==0){
            System.out.println("Even");
        }

        else {
            System.out.println( "Odd");
        }
    }

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");
        int x = sc.nextInt();

        OddEven obj = new OddEven(x);

    }
}
}