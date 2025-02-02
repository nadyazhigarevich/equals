public class Main {
    public static void main(String[] args) {
        User user = new User("Nadya", "Zhiga", new Role[]{Role.ADMIN, Role.ADMIN}, new Address(1, new Country(1, "Belarus", 375)));
        System.out.println(user);
    }
}