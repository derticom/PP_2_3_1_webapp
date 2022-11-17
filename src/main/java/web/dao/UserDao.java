package web.dao;

import web.entity.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);
}
