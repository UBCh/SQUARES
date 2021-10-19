import static org.junit.jupiter.api.Assertions.*;

public class SQR {
    public static void main(String[] args) {
        int bottomMinimum = 200;
        int bottomMaximum = 300;
        int zero = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > bottomMinimum && i * i < bottomMaximum) {
                System.out.println(" квадрат " + i + " = " + i * i + " это ,больше " + bottomMinimum + " это меньше " + bottomMaximum);
                zero++;
                if (i * i > bottomMaximum) {
                    break;
                }
                System.out.println("возвращаемое значение" + zero);
            }
        }
    }
}


