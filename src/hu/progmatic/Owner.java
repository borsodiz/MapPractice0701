package hu.progmatic;

public class Owner {

    private String ID;
    private String name;
    private boolean isFemale;

    public Owner() {
    }

    public Owner(String ID, String name, boolean isFemale) {
        this.ID = ID;
        this.name = name;
        this.isFemale = isFemale;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", isFemale=" + isFemale +
                '}';
    }
}
