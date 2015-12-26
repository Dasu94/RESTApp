package hms.dropWizardEx.domain;

/**
 * Created by dasuni on 12/17/15.
 */
public class Developer {

    private int id;
    private String name;
    private String email;

    public Developer() {
    }

    public Developer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
