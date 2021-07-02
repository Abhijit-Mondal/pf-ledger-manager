import java.io.Serializable;
import java.util.TreeMap;

public class Ledger implements Serializable {
    public TreeMap<Integer, YearlyStatement> yearlyStatements;
    public Ledger() {
        this.yearlyStatements = new TreeMap<>();
    }
}
