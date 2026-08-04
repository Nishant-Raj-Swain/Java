import java.util.Scanner;

class power{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n = sc.nextInt();

        System.out.print("Enter power : ");
        int p = sc.nextInt();

       /*  int result = 1;

        for(int i = 1; i<=p; i++){
            result *= n;
        }
        System.out.print("Power of "+n+" = "+result); */


        //Another Solution
        System.out.print("Power of "+n+" = "+ Math.pow(n,p)); 
    }
}