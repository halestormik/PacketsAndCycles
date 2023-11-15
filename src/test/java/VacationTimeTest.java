import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.PacketsAndCycles.services.VacationTime;

public class VacationTimeTest {

    @ParameterizedTest
   /* @CsvSource({
            "10000, 3000, 20000",
            "100000, 60000, 150000"
    })*/

    @CsvFileSource(files = "src/test/resources/data.csv")

    public void monthCount(int income, int expense, int treshold) {

        VacationTime service = new VacationTime();

        System.out.println();
        System.out.println("Количество месяцев отдыха в году составит: " + service.calculate(income, expense, treshold));
        System.out.println();
    }

    /* @Test
    void monthCount2() {

        VacationTime service = new VacationTime();

        int monthCount = service.calculate(100_000, 60_000, 150_000);

        System.out.println();
        System.out.println("Количество месяцев отдыха в году составит: " + monthCount);
    } */
}
