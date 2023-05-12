package org.project.Api.service.factory;

import org.project.Api.dao.factory.UserFactoryDao;
import org.project.Api.service.api.IUserService;
import org.project.Api.service.UserService;

public class UserFactoryService {

    private static volatile IUserService instance;

    private UserFactoryService() {}

    public static IUserService getInstance() {
        if (instance == null) {
            synchronized (UserFactoryService.class) {
                if (instance == null) {
                    instance = new UserService(UserFactoryDao.getInstance());
                }
            }
        }
        return instance;
    }
}
