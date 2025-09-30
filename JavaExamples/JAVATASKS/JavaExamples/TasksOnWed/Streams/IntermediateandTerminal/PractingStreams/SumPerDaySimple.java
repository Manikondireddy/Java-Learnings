package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    LocalDate date;
    double amount;

    Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}

public class SumPerDaySimple {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(LocalDate.of(2025, 9, 30), 100),
            new Transaction(LocalDate.of(2025, 9, 30), 50),
            new Transaction(LocalDate.of(2025, 10, 1), 200)
        );
        Map<LocalDate, Double> sumPerDay = transactions.stream()
            .collect(Collectors.groupingBy(t -> t.date, Collectors.summingDouble(t -> t.amount)));

        System.out.println(sumPerDay);
    }
}

