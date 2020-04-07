package com.tech552.TechBlog.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

    private Integer vote;

    //user

    //link
//    public Vote() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getVote() {
//        return vote;
//    }
//
//    public void setVote(Integer vote) {
//        this.vote = vote;
//    }
//
//    @Override
//    public String toString() {
//        return "Vote{" +
//                "id=" + id +
//                ", vote=" + vote +
//                '}';
//    }
}
