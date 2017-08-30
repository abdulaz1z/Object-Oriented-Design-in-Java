package clients;

import domain.User;

public class Web {
    public static void main(String[] args) {
        User user = new User.Builder("abdulaz1z", "stu.a.aziz@gmail.com")
                .firstName("Abdul")
                .lastName("Aziz")
                .phoneNumber("6466789376")
                .address("3151 Perry Ave")
                .build();
        System.out.println(user.toString());
    }
}
