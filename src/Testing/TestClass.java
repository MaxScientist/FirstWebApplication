package Testing;

public class TestClass {
    public void getInfo(int result){
        for (int i = 1; i < result; i++) {
            result*=i;
            System.out.println(result);
        }
    }
}
