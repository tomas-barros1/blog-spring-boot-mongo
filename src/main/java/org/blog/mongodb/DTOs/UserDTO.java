package org.blog.mongodb.DTOs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.blog.mongodb.entities.User;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {
    @Serial
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }

}
