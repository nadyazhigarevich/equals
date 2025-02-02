public class User {
    private String firstName;
    private String lastName;
    private Role[] roles;
    private Address address;

    public User(String firstName, String lastName, Role[] roles, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role[] getRoles() {
        return roles;
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

    public void setRoles(Role[] roles) {
        this.roles = roles;
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
        for (int i = 0; i < roles.length; i++) {
            if (!this.roles[i].equals(user.roles[i])) {
                return false;
            }
        }
        return this.firstName.equals(user.firstName)
                && this.lastName.equals(user.lastName)
                && this.address.equals(user.getAddress());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(this.firstName).append('\'');
        sb.append(", lastName='").append(this.lastName).append('\'');
        sb.append(", roles=[");

        for (int i = 0; i < this.roles.length; i++) {
            sb.append(this.roles[i]);
            if (i < this.roles.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("], address=").append(this.address);
        sb.append("}");

        return sb.toString();
    }
}
