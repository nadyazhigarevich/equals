public class Main {

    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();

        User[] users = userFactory.produce(7);

        for (User user : users) {
            System.out.println(user);
        }

        User user1 = new User("Nadya", "Zhiga", Role.USER, new Address(1, new Country(1, "Belarus", 375)));
        User user = new User("Nadya", "Zhiga", Role.USER, new Address(1, new Country(1, "Belarus", 375)));

        System.out.println("user equals user1: " + user.equals(user1));

    }
}