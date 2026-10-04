import org.bank.Utils.DateFormatter;
import org.bank.Utils.MoneyFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    @Test
    @DisplayName("Deve formatar valores inteiros no formato de dinheiro corretamente")
    void shouldFormatIntegerValueToMoneyFormatCorrectly(){
//        Arrange
        int value = 100;
        String expectedValue = "1,00";

//        Act
        String valueFormatted = MoneyFormatter.toMoney(value);

//        Assert
        assertEquals(expectedValue, valueFormatted);
    }

    @Test
    @DisplayName("Deve retornar a data formatada")
    void shouldReturnFormattedDate(){
        // Arrange
        String dateString = "05/11/1998";
        Date expectedDate = new Date(1998 - 1900, 10, 5);

        // Act
        Date finalDate = DateFormatter.toDate("05/11/1998");


        // Assert
        assertEquals(expectedDate, finalDate);
    }
}
