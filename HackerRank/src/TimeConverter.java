import java.util.Scanner;

/**
 * Created by rameshkaran on 8/28/16.
 */
public class TimeConverter {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String amPm = time.substring(8);
        time = time.substring(0,8);
        String []times = time.split(":");

        if("AM".equals(amPm)){
            if(times[0].equals("12"))
                System.out.print("00:"+times[1]+":"+times[2]);
            else{
                System.out.println(time);
            }
        }else{
            if(times[0].equals("12"))
                System.out.print(time);
            else{
                int hr = Integer.valueOf(times[0])+12;
                String hrs = String.valueOf(hr);
                System.out.println(hrs+":"+times[1]+":"+times[2]);
            }
        }
    }
}
