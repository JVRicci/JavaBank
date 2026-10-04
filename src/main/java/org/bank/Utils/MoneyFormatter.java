package org.bank.Utils;

public class MoneyFormatter {
    public static String toMoney(int value){
        String valueStr = String.valueOf(value);
        int valueSize = valueStr.length();

        if(valueSize <= 2) return "0,"+(valueSize == 1 ? "0" + value : value);

        String intPart = valueStr.substring(0, valueSize - 2);
        String decimalPart = valueStr.substring(valueSize - 2);

        return "R$"+intPart + "," + decimalPart;
    }
}
