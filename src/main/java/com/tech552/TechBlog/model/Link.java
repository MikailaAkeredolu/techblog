package com.tech552.TechBlog.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String url;

    //get list of comments
    @OneToMany(mappedBy = "link")    //one link mapped to Many comments
    private List<Comment> comments = new ArrayList<>();



}
