/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.relarion.publication.Repository;

import com.relarion.publication.Model.Comment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zaroui
 */

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
     List<Comment> findByPostId(Long postId);
    Comment findByIdAndPostId(Long id, Long postId);
    
}
