import org.junit.jupiter.api.Test;
import ru.netology.javaqa.PacketsAndCycles.services.VacationTime;

public class VacationTimeTest {

    @Test
    void monthCount1() {

        VacationTime service = new VacationTime();

        int monthCount = service.calculate(10_000, 3000, 20_000);

        System.out.println();
        System.out.println("Количество месяцев отдыха в году составит: " + monthCount);
        System.out.println();
    }

    @Test
    void monthCount2() {

        VacationTime service = new VacationTime();

        int monthCount = service.calculate(100_000, 60_000, 150_000);

        System.out.println();
        System.out.println("Количество месяцев отдыха в году составит: " + monthCount);
    }
}
