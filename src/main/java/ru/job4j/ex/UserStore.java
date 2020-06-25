package ru.job4j.ex;

/**
 * Created by Sergey
 */
public class UserStore {


    public static User findUser(User[] users, String login) throws UserNotFoundException {

        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                break;
            } else {
                throw new UserNotFoundException("User not found");
            }

        }
        return users[0];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is invalid");
        }
        return true;
    }

    public static void main(String[] args) {

        User[] users = {
                new User("Petr Arsentev1", true)
        };

        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserNotFoundException un) {
            un.printStackTrace();

        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        }


    }


}
