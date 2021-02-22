/*
 * @Author  : qun_f
 * @Time    : 2021/2/20 0:20
 */
package com.qun.blog.dao;

import com.qun.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlogId(Long blogId, Sort sort);

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}