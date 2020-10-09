/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.relarion.publication.Repository;

import com.relarion.publication.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author zaroui
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    
    
}
