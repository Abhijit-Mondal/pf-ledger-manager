import java.io.*;

public class App {
    public static void main(String[] args) {

        Staff staff = new Staff(
                "Madan Mohan Mondal",
                "Teacher",
                "Panighatta High School",
                "Kurseong",
                "PHS"
        );


        if(staff.PFledger.yearlyStatements.get(1990) == null) {
            YearlyStatement yearlyStatement = new YearlyStatement();
            MonthlyEntry monthlyEntry = new MonthlyEntry();
            monthlyEntry.openingBalance = 0;
            monthlyEntry.depositOrRefundBeforeXDay = 0;
            monthlyEntry.depositOrRefundAfterXDay = 93.30F;
            monthlyEntry.withdrawl = 0;
            monthlyEntry.monthlyLowestBalance = 0;
            monthlyEntry.interestForTheMonth = 0;
            monthlyEntry.closingBalance = 93.30F;
            monthlyEntry.remarks = "";
            yearlyStatement.monthlyEntries.put(Month.SEPTEMBER.name(), monthlyEntry);
            staff.PFledger.yearlyStatements.put(1990, yearlyStatement);
        }




        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{

            fos = new FileOutputStream(new File("").getAbsolutePath().concat("//PF_DATABASE//" + staff.getId() + ".ser"));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(staff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try{
            FileInputStream fis = new FileInputStream(new File("").getAbsolutePath().concat("//PF_DATABASE//" + staff.getId() + ".ser"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Staff newStaff = (Staff)ois.readObject();
            System.out.println(newStaff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
