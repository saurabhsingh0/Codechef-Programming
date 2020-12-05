import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VaccineDistribution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases= Integer.parseInt(br.readLine());
        for(int t=0; t<testCases; t++){
            String[] str = br.readLine().split(" ");
            int num = Integer.parseInt(str[0]);
            int vacinnate= Integer.parseInt(str[1]);
            int safe=0;
            int notSafe=0;
            str = br.readLine().split(" ");
            for(int i=0;i<num; i++){
                int age=Integer.parseInt(str[i]);
                if(age >=80 || age <=9 ){
                    notSafe++;
                }
            }
            safe=num-notSafe;
            //treat not safe people
            int day1=0;
            if(safe%vacinnate ==0){
                day1=safe/vacinnate;
            }
            else {
                day1 = (safe/vacinnate)+1;
            }
            //treat not safe people
            int day2=0;
            if(notSafe%vacinnate ==0){
                day2=notSafe/vacinnate;
            }
            else {
                day2 = (notSafe/vacinnate)+1;
            }
            //System.out.println("safe: " +(num-notSafe)  +" not safe: "+ notSafe);
            System.out.println(day1+day2);
        }
    }
}
