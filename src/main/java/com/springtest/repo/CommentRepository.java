package com.springtest.repo;

import com.springtest.model.Comment;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CommentRepository extends BaseRepository<Comment> {

	List<Comment> findByNewsId(Long id);
}