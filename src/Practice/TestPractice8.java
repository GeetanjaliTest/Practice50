package Practice;

public class TestPractice8 {
    String name;
    int id;
    TestPractice8() {
        System.out.println("default");
    }

    TestPractice8(String name, int id){
        System.out.println("parameterized:");
        this.name=name;
        this.id=id;
    }

    TestPractice8(TestPractice8 t){
        System.out.println("copy constructor:");
        this.id=t.id;
        this.name=t.name;
    }
    public static void main(String args[]){
        TestPractice8 t1=new TestPractice8();
        System.out.println(t1.id + " "+t1.name);
        TestPractice8 t2=new TestPractice8("chinmai",10);
        System.out.println(t2.id + " "+t2.name);
        TestPractice8 t3= new TestPractice8(t2);
        System.out.println(t3.id + " "+t3.name);
    }
}
