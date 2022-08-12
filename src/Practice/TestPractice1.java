package Practice;

public class TestPractice1 {

    public static void main(String args[]){
        String str="ab";
        reverseString(str);
    }

    public static void reverseString(String s){
        String rev=" ";
        for(int i=s.length()-1; i>=0; i--){
            rev= rev + s.charAt(i);
        }
        System.out.println(rev.trim());
    }
}
