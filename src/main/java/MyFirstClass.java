public class MyFirstClass {

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        int intFromSecondClass = secondClass.returnInt();
        String result = "~~~" + intFromSecondClass + "~~~";
        System.out.println(result);
    }
}
