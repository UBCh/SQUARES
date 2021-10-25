import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSquaresService() {
        SQRService service = new SQRService();
        int bottomMinimum = 200;
        int bottomMaximum = 300;
        int expected = 3;
        int actual = service.сalculateSquaresService(bottomMinimum, bottomMaximum);
        assertEquals(expected, actual);
    }


}

