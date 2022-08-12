package Practice;

import java.util.HashMap;
import java.util.Map;

public class TestPractice7 {
    public static void main(String args[]){
        String s="HelooChinmai";
        printFequency(s);
    }
    public static void printFequency(String s){
        Map<Character,Integer> mp= new HashMap<Character,Integer>();

        for(int i=0; i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s.length();i++){
            if(mp.get(s.charAt(i)) != 0){
                System.out.print(s.charAt(i)+ " "+ mp.get(s.charAt(i)) + " ");
                mp.put(s.charAt(i), 0);
            }
        }
    }
}
