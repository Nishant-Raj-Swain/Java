import java.util.Arrays;
class arr{
    public static void main(String args[]){

        String name[] = new String[]{"nishi","isu","sisu"};




        //toString()
        System.out.println(Arrays.toString(name));

        //asList()
        System.out.println(Arrays.asList(name));


        //deeptoString()
        int arr[][] = {{30,40},{10,20}};
        System.out.print(Arrays.deepToString(arr));
        System.out.print(Arrays.deepToString(name));


    }
}