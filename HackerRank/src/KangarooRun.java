import java.util.Scanner;

/**
 * Created by rameshkaran on 8/28/16.
 */
public class KangarooRun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        double steps = 0;
        steps = (x2-x1)/(double)(v1-v2);
        if(steps<0)
            System.out.print("NO");
        else{
            if(steps == Math.round(steps))
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
}
