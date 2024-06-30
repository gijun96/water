package com.common.study.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private String email;
}
