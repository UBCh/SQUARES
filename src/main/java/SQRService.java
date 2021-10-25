
public class SQRService {

    public int сalculateSquaresService(int bottomMinimum, int bottomMaximum) {

        int zero = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > bottomMinimum && i * i < bottomMaximum) {

                zero++;
                if (i * i > bottomMaximum) {
                    break;
                }
            }
        }
        return zero;
    }

}
