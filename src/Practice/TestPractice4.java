package Practice;

import java.util.HashSet;

public class TestPractice4 {

    public static void main(String args[]){
        String s="abbc";
        String b="abc";
        System.out.println(hasAllUnique(s));
        System.out.println(hasAllUnique(b));
    }
  public static boolean hasAllUnique(String s){
        HashSet hs = new HashSet();
        for(int i=0; i<s.length(); i++){
            if(!hs.add(s.charAt(i))){
                return false;
            }
        }
        return true;
  }

}
