import java.util.Scanner;
class sum_of_n_natural_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");
        int x = sc.nextInt();

        int sum=0;

        for(int i=1;i<=x;i++){
              sum += i;
        }
        System.out.println("sum = "+sum);
    }
}