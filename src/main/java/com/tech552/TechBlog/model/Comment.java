package com.tech552.TechBlog.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String body;

    @ManyToOne
    @NonNull
    private Link link;  //many comments linked to one link
}
