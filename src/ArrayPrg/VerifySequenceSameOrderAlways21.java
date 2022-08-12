package ArrayPrg;

import java.util.ArrayList;

public class VerifySequenceSameOrderAlways21 {

    public static void main(String args[]){
        char[] c="rbnyuabcde".toCharArray();
        String key="a";
        findInorder(c, key);
    }
    public static void findInorder(char[] c, String key){
        ArrayList<String> al= new ArrayList<String>();
        for (int i=0; i<c.length; i++){
            al.add(String.valueOf(c[i]));
        }
        //System.out.println(al.indexOf(key));
        int j= al.indexOf(key);
        for(int k=j; k< al.size(); k++){
            System.out.println(k+ " "+ al.get(k).toString());
        }

    }
}
