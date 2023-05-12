package org.project.Api.dao.api;

import org.project.Api.core.dto.UserDTO;

import java.util.Date;
import java.util.List;

public interface IUserDao {

    List<UserDTO> get();

    UserDTO get(String login, int password);

    UserDTO save(UserDTO userDTO);
}
