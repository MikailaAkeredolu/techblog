package com.tech552.TechBlog.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

    private Integer vote;

    //user

    //link

}
