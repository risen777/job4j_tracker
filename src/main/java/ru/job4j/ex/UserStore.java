package ru.job4j.ex;

/**
 * Created by Sergey
 */
public class UserStore {


    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                result = users[i];
                break;
            }
            if (result == null) {
                throw new UserNotFoundException("User not found");
            }
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is invalid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Name of user is small");
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
