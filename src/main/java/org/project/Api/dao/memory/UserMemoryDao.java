package org.project.Api.dao.memory;

import org.project.Api.core.dto.UserDTO;
import org.project.Api.dao.api.IUserDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserMemoryDao implements IUserDao {

    private final Map<String, UserDTO> users = new ConcurrentHashMap<>();

    public UserMemoryDao() {
        UserDTO dto =  new UserDTO("Admin", "Admin");
        users.put(dto.getLogin(), dto);
    }

    @Override
    public List<UserDTO> get() {
        return new ArrayList<>(this.users.values());
    }

    @Override
    public UserDTO get(String login, int password) {
        return this.users.get(login);
    }

    @Override
    public synchronized UserDTO save(UserDTO userDTO) {
        this.users.put(userDTO.getLogin(),userDTO);
        return userDTO;
    }
}
