package di.stage3.context;

import di.User;
import di.stage0.staticreferences.UserDaoImpl;

class UserService {

    private UserDao userDao;

    public UserService(final UserDao userDao) {
        this.userDao = userDao;
    }

    public User join(final User user) {
        userDao.insert(user);
        return userDao.findById(user.getId());
    }

    public UserService() {
        userDao = new InMemoryUserDao();
    }
}
