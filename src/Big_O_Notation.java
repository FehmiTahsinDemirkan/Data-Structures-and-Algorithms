public class Big_O_Notation {
    //Big O = yazdığımız kodların karmaşıklığını gösteren yapı.
    // –Space complexity (Yer karmaşıklığı)
    // -time complextiy(Zaman karmaşıklığı)
    //www.bigocheatsheet.com
    //Brute Force(Kaba kuvvet) en ilkel çözüm
    //Big O her zaman en kötü seçeneği baz alarak yapılır.

    // O(1) - Constant Time Complexity

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 3, 4, 5};

        example1(sampleArray);
        example2(sampleArray);
        example3(sampleArray);
    }
    // O(1) - Constant Time Complexity
    public static void example1(int[] array) {
        int firstElement = array[0];
        System.out.println("First element: " + firstElement);
        System.out.println("**********************");
    }

    // O(n) - Linear Time Complexity
    public static void example2(int[] array) {
        for (int element : array) {
            System.out.println(element);

        }
        System.out.println("********************");
    }

    // O(n^2) - Quadratic Time Complexity
    public static void example3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }

        }
        System.out.println("***************************");
    }
}
