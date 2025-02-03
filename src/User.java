public class User {
    private String firstName;
    private String lastName;
    private Role role;
    private Address address;

    public User(String firstName, String lastName, Role role, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.address = address;
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;

        return this.firstName.equals(user.firstName)
                && this.lastName.equals(user.lastName)
                && this.role.equals(user.role)
                && this.address.equals(user.getAddress());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(this.firstName).append('\'');
        sb.append(", lastName='").append(this.lastName).append('\'');
        sb.append(", role='").append(this.role).append('\'');
        sb.append(", address=").append(this.address);
        sb.append("}");

        return sb.toString();
    }
}
