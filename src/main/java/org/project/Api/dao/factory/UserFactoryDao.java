package org.project.Api.dao.factory;

import org.project.Api.dao.api.IUserDao;
import org.project.Api.dao.memory.UserMemoryDao;

public class UserFactoryDao {

    private static volatile IUserDao instance;

    public static IUserDao getInstance() {
        if (instance == null) {
            synchronized (UserFactoryDao.class) {
                if (instance == null) {
                    instance = new UserMemoryDao();
                }
            }
        }
        return instance;
    }
}
