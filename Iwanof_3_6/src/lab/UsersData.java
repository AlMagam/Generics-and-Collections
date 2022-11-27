package lab;

import java.util.HashMap;
import java.util.Map;

public class UsersData {
    public static void printSpecificUsers(Map<String, String> users) {
        for (Map.Entry<String,String> entry : users.entrySet()) {
            if(entry.getValue().length() > 6) {
                System.out.println("Username: " + entry.getKey() +
                        " Password :" + entry.getValue());
            }
        }
    }
    public static void testMapOfUsers() {
        Map<String,String> users = new HashMap<>();
        users.put("User1","aboba322");
        users.put("User2","pswrd");
        users.put("User3","zurukzuruk228");
        users.put("User4","qwerty123");
        printSpecificUsers(users);
    }

    public static void main(String[] args) {
        new UsersData().testMapOfUsers();
    }
}
