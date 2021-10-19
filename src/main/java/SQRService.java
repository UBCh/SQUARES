
public class SQRService {

    public   int CalculateSquaresService(int bottomMinimum, int bottomMaximum, int zero){


        for (int i = 10; i < 100; i++) {
            if (i * i > bottomMinimum && i * i < bottomMaximum) {
                System.out.println(" квадрат " + i + " = " + i * i + " это ,больше " + bottomMinimum + " это меньше " + bottomMaximum);
                zero++;
                if (i * i > bottomMaximum) {
                    break;
                }
                System.out.println("возвращаемое значение" + zero);
            }
        } return zero;
    }

}
