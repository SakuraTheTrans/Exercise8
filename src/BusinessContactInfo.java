public class BusinessContactInfo extends ContactInfo {
    private String phoneNum;

    public BusinessContactInfo(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String displayContact() {
        return ("Name : " + this.getName() + "\nEmail : " + this.getEmail() + "\nPhone : " + this.getPhoneNum() + "\n");
    }
}