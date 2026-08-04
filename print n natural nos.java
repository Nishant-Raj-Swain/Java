import java.util.Scanner;
class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural no : ");
        int x = sc.nextInt();

        while (x>0){
            System.out.println(x--);
        }
    }
}