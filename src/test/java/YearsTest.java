import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YearsTest {

    @Order(1)
    @ParameterizedTest(name = "{index} => fromYear={0}, toYear={1}")
    @CsvSource({
            "1998, 2005",
            "2010, 2020"
    })
    public void checkYearsTest1(int fromYear, int toYear) throws InvalidYearsException {
        Years.printBonusDatesBetween(fromYear,toYear);
    }

    @Order(2)
    @ParameterizedTest(name = "{index} => fromYear={0}, toYear={1}")
    @CsvSource({
            "2020, 2005"
    })
    public void checkYearsTest2(int fromYear, int toYear) throws InvalidYearsException {
        Years.printBonusDatesBetween(fromYear,toYear);
    }

    @Order(3)
    @ParameterizedTest(name = "{index} => fromYear={0}, toYear={1}")
    @CsvSource({
            "2020, 2020"
    })
    public void checkYearsTest3(int fromYear, int toYear) throws InvalidYearsException {
        try {
            Years.printBonusDatesBetween(fromYear,toYear);
        } catch (Exception ex) {
            if (ex instanceof InvalidYearsException ) {
                System.out.println("Test 3 successful: " + ex.getMessage()
                        + " " + "[fromYear: " + fromYear
                        + " " + "toYear: " + toYear + "]");
            }
            else {
                System.out.println("Test 3 not successful: " + ex.getMessage());
            }
        }
    }
}
