import java.io.Serializable;
import java.util.HashMap;

public class YearlyStatement implements Serializable {
    public HashMap<String, MonthlyEntry> monthlyEntries;

    public YearlyStatement() {
        this.monthlyEntries = new HashMap<>();
    }
}
