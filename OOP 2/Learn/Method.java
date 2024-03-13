public class Method {

    public void Test1(){
        System.out.println("Publik");
    }

    static void Test2(){
        System.out.println("Static");
    }

    public static void main(String[] args) {
        Test2();
        Method T1 = new Method();
        T1.Test1();
    }
}
