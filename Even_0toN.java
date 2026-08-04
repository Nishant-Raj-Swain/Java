import java.util.Scanner;
class Even_0toN{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");

        int n = sc.nextInt();

        for(int i =0; i<=n; i+=2){
            System.out.println(i);

        }

    }

}