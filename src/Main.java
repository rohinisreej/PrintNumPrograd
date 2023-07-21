import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int printNum(int N){
        if(N==1)
        {
            return 1;
        }
        printNum(N-1);
        out.println(N);
        return N;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        out.println("Enter n");
        int n=scanner.nextInt();
        printNum(n);
    }
}