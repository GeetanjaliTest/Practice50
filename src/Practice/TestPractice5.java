package Practice;

import java.util.HashMap;
import java.util.Map;

public class TestPractice5 {

    public static void main(String args[]){
        char[] strAr= "hellochinmai".toCharArray();
        countDuplicates(strAr);
    }
    public static void countDuplicates(char[] s){
        Map<Character,Integer> mp = new HashMap<>();
        for(char c: s){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            } else {
                mp.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> en: mp.entrySet()){
           if(en.getValue()>1){
               System.out.println(en.getKey()+ " "+en.getValue());
           }
        }
    }
}
