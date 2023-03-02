import java.util.concurrent.ForkJoinPool;
public class Cicle {

     public static void main(String[] args)
 {
        //    for
        for (int i = 1; i < 9; i++) {
            System.out.printf("number", i);
        }
//    DO while

        int dw = 7;

        do {
            System.out.printf("do while", dw);
            dw--;
        } while (dw > 0);
//        while
        int w = 5;
        while (w > 0) {
            System.out.printf("while", w);
            w--;
        }
    }
}