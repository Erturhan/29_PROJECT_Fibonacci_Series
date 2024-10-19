import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int a = 0  ;

        System.out.print("Please enter any number :");
        a = scan.nextInt();
        a = a  ;

        int [] arr = new  int[a];
        arr [0] = 1 ;
        arr [1] = 1 ;

        for (int i = 2 ; i <a ;i++  )
        {
            arr[i]=arr[i-1]+arr[i-2];

        }
        for (int i = 0 ; i < a ;i++  )
        {
            System.out.print(arr[i]+" " );
        }







    }

}