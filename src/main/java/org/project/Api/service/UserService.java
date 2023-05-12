package org.project.Api.service;

import org.project.Api.core.dto.UserDTO;
import org.project.Api.dao.api.IUserDao;
import org.project.Api.dao.memory.UserMemoryDao;
import org.project.Api.service.api.IUserService;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class UserService implements IUserService {

    private final IUserDao userDao;

    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDTO> get() {
        return userDao.get();
    }

    @Override
    public UserDTO get(String login, int password) {
        return userDao.get(login, password);
    }

    @Override
    public UserDTO save(String login, String password, String surname, String name, LocalDateTime dateOfBirth) {
        UserDTO dto = new UserDTO();
        dto.setLogin(login);
        dto.setPassword(password);
        dto.setSurname(surname);
        dto.setName(name);
        dto.setDateOfBirth(dateOfBirth);
        dto.setRole(login);
        return userDao.save(dto);
    }
}
