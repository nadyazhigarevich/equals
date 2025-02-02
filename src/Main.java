public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN, Role.USER}, new Address(1, new Country(1, "Belarus", 375)));
        User user2 = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN}, new Address(1, new Country(1, "Belarus", 375)));
        User user3 = new User("Artem", "Zhiga", new Role[]{Role.ADMIN, Role.ADMIN}, new Address(1, new Country(1, "Belarus", 375)));
        User user4 = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN, Role.ADMIN}, new Address(2, new Country(1, "Belarus", 375)));
        User user5 = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN, Role.ADMIN}, new Address(1, new Country(1, "Belarus", 888)));
        User user = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN, Role.USER}, new Address(1, new Country(1, "Belarus", 375)));

        System.out.println("user equals user1: " + user.equals(user1));
        System.out.println("user equals user2: " + user.equals(user2));
        System.out.println("user equals user3: " + user.equals(user3));
        System.out.println("user equals user4: " + user.equals(user4));
        System.out.println("user equals user5: " + user.equals(user5));

        System.out.println(user);
    }
}