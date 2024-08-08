package org.blog.mongodb.controllers.exceptions;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private final Long timestamp;
    private final Integer status;
    private final String error;
    private final String message;
    private final String path;

}
