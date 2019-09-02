package com.jd.service;

import com.jd.enity.Comment_Info;
import com.jd.mapper.Comment_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Comment_InfoServiceImpl implements Comment_InfoService{
    @Autowired
    Comment_InfoMapper comment_infoMapper;

    @Override
    public List<Comment_Info> getCommentByProId(Integer id) {
        return comment_infoMapper.getCommentByProId(id);
    }
}
