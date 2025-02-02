public class Country {
    private int id;
    private String name;
    private int phoneCode;

    public Country(int id, String name, int phoneCode) {
        this.id = id;
        this.name = name;
        this.phoneCode = phoneCode;
    }

    public Country() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return this.id == country.id
                && this.phoneCode == country.phoneCode
                && this.name.equals(country.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Country{");
        sb.append("id='").append(this.id).append('\'');
        sb.append(", name='").append(this.name).append('\'');
        sb.append(", phoneCode='").append(this.phoneCode).append('\'');
        sb.append("}");

        return sb.toString();
    }
}
