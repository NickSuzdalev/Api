package org.project.Api.service.api;

import org.project.Api.core.dto.UserDTO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface IUserService {

    List<UserDTO> get();

    UserDTO get(String login, int password);

    UserDTO save(String login, String password, String surname, String name, LocalDateTime dateOfBirth);
}
