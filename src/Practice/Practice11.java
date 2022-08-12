package Practice;

public class Practice11 {
    Practice11(){
        this(9);
        System.out.println("This is default");
    }

    Practice11(int x){
        System.out.println(x);
    }

        public static void main(String args[]){
            Practice11 p1= new Practice11();
        }
    }

