/*
 * @Author  : qun_f
 * @Time    : 2021/2/20 0:17
 */
package com.qun.blog.service;

import com.qun.blog.po.Comment;
import java.util.List;


public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}