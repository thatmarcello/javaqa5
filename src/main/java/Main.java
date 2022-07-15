import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println("Количество чисел в квадрате в заданном диапазоне = " + service.calcSqrt(200, 230));
    }
}
