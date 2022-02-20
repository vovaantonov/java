public class SecondClass {
    public static int firstField = 1234;

    public int returnInt() {
        String modifiedField = String.format("---%d---", firstField);
        System.out.println(modifiedField);
        return firstField;
    }
}
