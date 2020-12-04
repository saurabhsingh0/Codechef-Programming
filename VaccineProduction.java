import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VaccineProduction {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int d1 = Integer.parseInt(str[0]);
        int v1 = Integer.parseInt(str[1]);
        int d2 = Integer.parseInt(str[2]);
        int v2 = Integer.parseInt(str[3]);
        int total = Integer.parseInt(str[4]);
        int count =0;
        int counter=1;
        while(true){
            if(counter>=d1){
                count+=v1;
            }
            if(counter>=d2){
                count+=v2;
            }
            if(count>=total) {
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
