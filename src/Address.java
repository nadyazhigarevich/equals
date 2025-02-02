public class Address {
    private int id;
    private Country country;

    public Address(int id, Country country) {
        this.id = id;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public Country getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return this.id == address.id
                && this.country.equals(address.getCountry());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append("id='").append(this.id).append('\'');
        sb.append(", country=").append(this.country);
        sb.append("}");

        return sb.toString();
    }
}
