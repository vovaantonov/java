public class MyFirstClass {

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        int intFromSecondClass = secondClass.returnInt();
        String formattedString = String.format("~~~%d~~~", intFromSecondClass);
        System.out.println(formattedString);
    }
}
