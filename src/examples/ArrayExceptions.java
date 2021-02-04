package examples;

public class ArrayExceptions {
    public static void main(String[] args) {
        createArrayStoreException();
        createArrayIndexOutOfBoundsException();
    }

    public static void createArrayStoreException() {
        Object[] array = new String[5];
        array[0] = 2;
    }

    public static void createArrayIndexOutOfBoundsException() {
        String[] name = { "tom", "dick", "harry" };
        for (int i = 0; i <= name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
