public class Main {
    public static void main(String[] args) {

        //task #1.1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task #1.2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task #1.3
        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //task #1.4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task #2.1
        for (int i = 1904; i < 2096; i +=4) {
            System.out.println(i + " год является високосным ");
            }

    }
}