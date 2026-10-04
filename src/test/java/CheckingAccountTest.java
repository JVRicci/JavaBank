import org.bank.Utils.DateFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.bank.Account.CheckingAccount;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckingAccountTest {
    private CheckingAccount TestCheckingAccount;

    @BeforeEach
    void setUp(){
        Date birthDate = DateFormatter.toDate("10/05/1998");
        TestCheckingAccount = new org.bank.Account.CheckingAccount(123, 123, 200, "John Doe", birthDate);
    }

    @Test
    @DisplayName("Deve ser possivel sacar dinheiro")
    void shouldBePossibleToWithdrawMoney(){
        // Arrange
        int value = 100;
        String expected = "Valor sacado com sucesso!";

        // Act
        String response = TestCheckingAccount.withdrawMoney(value);

        //Assert
        assertEquals(expected, response);
    }

    @Test
    @DisplayName("Não deve ser possivel sacar dinheiro")
    void shoudNotBePossibleToWithdrawMoney(){
        //Arrange
        int wrongValue = 300;
        String errorExpected = "Valor não pode ser maior que a quantidade em conta.";

        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            TestCheckingAccount.withdrawMoney(wrongValue);
        });

        //Assert
        assertEquals(errorExpected, exception.getMessage());
    }

    @Test
    @DisplayName("Deve retornar o saldo atual da conta")
    void shouldReturnActualAccountValue(){
        //Arrange
        String expectedValue = "R$2,00";

        //Act
        String valueInAccount = TestCheckingAccount.getCurrentBalance();

        //Assert
        assertEquals(expectedValue, valueInAccount);
    }
}
