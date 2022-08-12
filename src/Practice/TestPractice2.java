package Practice;

import java.util.Arrays;

public class TestPractice2 {
    public static void main(String args[]){
        char[] s= "aabbbnnn".toCharArray();
        int n=s.length;
        System.out.println(remDuplicates(s,n));}

    public static String remDuplicates(char[] s, int n){
        int index=0;
        for(int i=0; i<n; i++){
            int j;
            for( j=0; j<i; j++){
                if(s[i]==s[j]){
                    break;
                }
            }
            if(j==i){
                s[index++]=s[i];

            }

        }
        return String.valueOf(Arrays.copyOf(s,index));
    }

}
