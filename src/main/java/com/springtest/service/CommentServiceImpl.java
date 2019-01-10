package com.springtest.service;

import com.springtest.model.Comment;

import com.springtest.repo.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Qualifier("commentRepository")
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    NewsService newsService;


    @Override
    public void saveEditFromRequest(HttpServletRequest request, Long id) {
        Comment comment = new Comment();

        comment.setContent(request.getParameter("comment"));
        comment.setDate(new Date());
        comment.setNews(newsService.getOne(id, false));

        comment.setLikesCount(0L);
        comment.setDislikesCount(0L);


        commentRepository.save(comment);

    }

    @Override
    public List<Comment> findByNewsId(Long id) {
        return commentRepository.findByNewsId(id);
    }
}
