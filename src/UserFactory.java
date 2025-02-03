import java.util.Random;

public class UserFactory {
    private String[] FIRST_NAMES = {"Nadya", "Artem", "Tosha", "Misa"};
    private String[] LAST_NAMES = {"Zhiga", "Zhuk", "Ell", "Grib"};
    private String[] COUNTRY_NAMES = {"Belarus", "Italy", "France", "USA"};
    Role[] ROLES = Role.values();

    public User[] produce(int amount) {
        Random random = new Random();
        User[] users = new User[amount];

        for (int i = 0; i < users.length; i++) {
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            Role randomRole = ROLES[random.nextInt(ROLES.length)];
            Address address = new Address(i, new Country(i, COUNTRY_NAMES[random.nextInt(COUNTRY_NAMES.length)], random.nextInt(900) + 100));
            User user = new User(firstName, lastName, randomRole, address);
            users[i] = user;
        }
        return users;
    }
}
