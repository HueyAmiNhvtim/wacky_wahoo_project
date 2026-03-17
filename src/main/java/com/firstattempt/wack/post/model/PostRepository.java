package com.firstattempt.wack.post.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Basically a central class for handling the respective entity
// For JPA Repository, check here for the differences: https://stackoverflow.com/questions/14014086/what-is-difference-between-crudrepository-and-jparepository-interfaces-in-spring
// Basically, JPARepository interface is the more advanced version the CRUDRepository, including more stuff such
// such as pagination (division of database query results into more manageable chunks), record sorting, etc.
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
