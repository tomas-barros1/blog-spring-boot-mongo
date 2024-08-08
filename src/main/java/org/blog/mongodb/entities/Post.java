package org.blog.mongodb.entities;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.blog.mongodb.DTOs.AuthorDTO;
import org.blog.mongodb.DTOs.CommentDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "posts")
public class Post implements Serializable {

    @Serial
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Instant date;
    private String title;
    private String body;
    private AuthorDTO author;

    @Setter(AccessLevel.PRIVATE)
    private List<CommentDTO> comments = new ArrayList<>();

}
