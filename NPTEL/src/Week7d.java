import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week7d {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        for(int i=string.length()-1;i>=0;i--)
        {
            System.out.print(string.charAt(i));
        }

    }
}
