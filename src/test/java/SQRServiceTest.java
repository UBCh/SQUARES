import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSquaresService() {
        SQRService service = new SQRService();
       int bottomMinimum = 200;
       int bottomMaximum = 300;
       int zero = 0;
        int expected = 3;
        int actual = service.CalculateSquaresService(bottomMinimum,bottomMaximum,zero);
        assertEquals(expected, actual);
    }





    }

