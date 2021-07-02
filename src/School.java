import java.io.Serializable;

public class School implements Serializable {
    private String name;
    private String subDivision;
    private String shortName;

    public School(String name, String subDivision, String shortName) {
        this.name = name;
        this.subDivision = subDivision;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return name + " [" + shortName + "]" + ", " + subDivision;
    }
}
