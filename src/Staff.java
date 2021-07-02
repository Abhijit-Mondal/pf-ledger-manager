import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff implements Serializable {
    private String id;
    private String name;
    private String designation;
    private School school;
    public Ledger PFledger;

    public Staff(String name, String designation, String schoolName, String schoolSubDivision, String schoolShortName) {
        this.id = new SimpleDateFormat("yyyy").format(new Date()) +
                schoolShortName +
                (int) (Math.random() * 1000);
        this.name = name;
        this.designation = designation;
        this.school = new School(schoolName, schoolSubDivision, schoolShortName);
        this.PFledger = new Ledger();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", designation: " + designation + ", school: " + school;
    }
}
