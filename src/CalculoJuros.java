import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculoJuros {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("----- PROGRAMA PARA CÁLCULO DE JUROS ACUMULADO ENTRE DATAS -----");

        System.out.println("Insira o valor (ex: 999,99): ");
        BigDecimal valor = input.nextBigDecimal();
        input.nextLine();

        System.out.println("Insira a data de vencimento (dd/mm/yyyy): ");
        String data = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate vencimento = LocalDate.parse(data, formatter);

        LocalDate dataAtual = LocalDate.now();
        long diasLong = ChronoUnit.DAYS.between(vencimento, dataAtual);
        int dias = (int) diasLong;

        BigDecimal jurosTotal = BigDecimal.ZERO;

        if(dias > 0){
            jurosTotal = valor.multiply(BigDecimal.valueOf(0.025)
                    .multiply(BigDecimal.valueOf(dias)).setScale(2, RoundingMode.HALF_UP));
        }

        BigDecimal totalAPagar = valor.add(jurosTotal).setScale(2, RoundingMode.HALF_UP);
        jurosTotal = jurosTotal.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Data inserida: " + data);
        System.out.println("Valor inserido: " + valor);
        System.out.println("Total de dias entre hoje e o vencimento: " + dias);
        System.out.println("TOTAL A PAGAR COM JUROS: " + totalAPagar);
        System.out.println("JUROS TOTAL: " + jurosTotal);
    }
}
