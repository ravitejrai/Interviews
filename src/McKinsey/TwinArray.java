package McKinsey;

import java.util.Arrays;
import java.util.Scanner;

public class TwinArray {

    static int twinArrays(int[] a, int[] b){
        int n = a.length;
        int[] c = a.clone();
        int[] d = b.clone();
        Arrays.sort(c);
        Arrays.sort(d);
        if (c[0]==c[1]||d[0]==d[1])
            return c[0]+d[0];
        int e = -1;
        int f = -1;
        for (int i = 0; i < n; i++)
            if (a[i]==c[0])
                e = i;
        for (int i = 0; i < n; i++)
            if (b[i]==d[0])
                f = i;
        if (e!=f)
            return c[0]+d[0];
        else
            return Math.min(c[0]+d[1],c[1]+d[0]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
