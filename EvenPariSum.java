import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenPariSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int t=0; t<testCases; t++){
            String[] str = br.readLine().split(" ");
            long num1= Integer.parseInt(str[0]);
            long num2 = Integer.parseInt(str[1]);

            //find number of even and odd numbers in num1
            long even1=num1/2;
            long odd1 = num1-even1;

            //find number of even and odd numbers in num1
            long even2 = num2/2;
            long odd2 = num2-even2;

            long ans = (even1*even2) + (odd1*odd2);

            System.out.println(ans);
        }
    }
}
