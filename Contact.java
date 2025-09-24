public class Contact {
    String name;
    String company;
    String title;
    String phone1Label;
    String phone1;
    String phone2Label;
    String phone2;
    String phone3Label;
    String phone3;
    String email;

    public Contact(String name, String company, String title,
                   String phone1Label, String phone1,
                   String phone2Label, String phone2,
                   String phone3Label, String phone3,
                   String email) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.phone1Label = phone1Label;
        this.phone1 = phone1;
        this.phone2Label = phone2Label;
        this.phone2 = phone2;
        this.phone3Label = phone3Label;
        this.phone3 = phone3;
        this.email = email;
    }

    public String toString() {
        String result = "Name: " + name +
                        "\nCompany: " + company +
                        "\nTitle: " + title;
        if (!phone1.isEmpty()) result += "\n" + phone1Label + " Phone: " + phone1;
        if (!phone2.isEmpty()) result += "\n" + phone2Label + " Phone: " + phone2;
        if (!phone3.isEmpty()) result += "\n" + phone3Label + " Phone: " + phone3;
        if (!email.isEmpty()) result += "\nEmail: " + email;
        return result;
    }
}
