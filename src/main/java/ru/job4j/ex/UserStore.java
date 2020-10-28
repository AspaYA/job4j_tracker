package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean noSearch = true;
        for (User user: users) {
            if (user.equals(login)) {
                noSearch = false;
                break;
            }
        }
        if (noSearch) {
            throw new UserNotFoundException("No user");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("Bad user");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Andrey Filev", true)
        };
        try {
            User user = findUser(users, "Andrey Filev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            System.out.println("no valid");
        } catch (UserNotFoundException nf) {
            System.out.println("no found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
