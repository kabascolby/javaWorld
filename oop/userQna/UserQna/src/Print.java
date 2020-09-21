public class Print {
    private UserInfo user;

    public PrintUser(UserInfo user) {
        this.user = user;
    }

    public void printUser() {
        System.out.println();
        System.out.println("Full Name: [" + user.name + "]");
        System.out.println("Age: [" + user.age + "]");
        System.out.println("Birth country: [" + user.country + "]");
        System.out.println("Prefered Color: [" + user.color + "]");
    }
}
