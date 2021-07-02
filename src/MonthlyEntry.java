import java.io.Serializable;

public class MonthlyEntry implements Serializable {
    public float openingBalance;
    public float depositOrRefundBeforeXDay;
    public float depositOrRefundAfterXDay;
    public float withdrawl;
    public float monthlyLowestBalance;
    public float interestForTheMonth;
    public float closingBalance;
    public Month month;
    public String remarks;
}
