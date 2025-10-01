package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;
    import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    private LocalDate date;
    private double amount;

    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}

public class TransactionSumByDay {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(LocalDate.of(2025, 10, 1), 100.0),
            new Transaction(LocalDate.of(2025, 10, 1), 50.0),
            new Transaction(LocalDate.of(2025, 10, 2), 75.0),
            new Transaction(LocalDate.of(2025, 10, 2), 25.0),
            new Transaction(LocalDate.of(2025, 10, 3), 200.0)
        );
        Map<LocalDate, Double> totalByDate = transactions.stream()
            .collect(Collectors.groupingBy(
                Transaction::getDate,
                LinkedHashMap::new,
                Collectors.summingDouble(Transaction::getAmount)
            ));

        totalByDate.forEach((date, total) -> 
            System.out.println(date + " -> " + total)
        );
    }
}

    

