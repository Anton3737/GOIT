package task13.TASK1;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JsonPlaceholderClient client = new JsonPlaceholderClient();

        try {
            String newUser = "{ \"name\": \"John Doe\", \"username\": \"johndoe\", \"email\": \"johndoe@example.com\" }";
            String createdUser = client.createUser(newUser);
            System.out.println("Created User: " + createdUser);

            int userIdToUpdate = 1;
            String updatedData = "{ \"name\": \"Updated Name\", \"username\": \"updated_username\", \"email\": \"updated_email@example.com\" }";
            String updatedUser = client.updateUser(userIdToUpdate, updatedData);
            System.out.println("Updated User: " + updatedUser);

            int userIdToDelete = 1;
            boolean isDeleted = client.deleteUser(userIdToDelete);
            System.out.println("User Deleted: " + isDeleted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
