public class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String address;

    // Konstruktor
    public Person(String firstname, String lastname, String email, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
    }

    // Gettery i Settery
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Nadpisanie metody toString
    @Override
    public String toString() {
        return "Hi my name is " + firstname + " " + lastname +
                ", my email is " + email +
                " and I live in " + address + ".";
    }
}
