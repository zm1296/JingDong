package com.jd.service;

import com.jd.enity.Comment_Info;

import java.util.List;

public interface Comment_InfoService {
    public List<Comment_Info> getCommentByProId(Integer id);
}
