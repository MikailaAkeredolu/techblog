package com.tech552.TechBlog.repositories;

import com.tech552.TechBlog.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    //find a link by title


}
