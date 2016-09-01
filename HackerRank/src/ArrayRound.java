import java.util.Scanner;

/**
 * Created by rameshkaran on 8/28/16.
 */
public class ArrayRound {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int []arr = new int [n];
        int []query = new int[q];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<q;i++){
            query[i]= sc.nextInt();
        }
        //roundRight(arr, k);
        for(int i =0;i<q;i++){
            int newPlace = query[i]-k;
            while(newPlace<0)
                newPlace = newPlace+arr.length;
            System.out.println(arr[newPlace]);
        }
    }
}
