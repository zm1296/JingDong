package com.jd.mapper;

import com.jd.enity.User_Collection;

public interface User_CollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_Collection record);

    int insertSelective(User_Collection record);

    User_Collection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Collection record);

    int updateByPrimaryKey(User_Collection record);
}