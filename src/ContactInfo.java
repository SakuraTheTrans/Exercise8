public class ContactInfo {
    private String name;
    private String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "contactInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String displayContact(){
        return ("Name : " + this.getName() + "\nEmail : " + this.getEmail() + "\n");
    }
}