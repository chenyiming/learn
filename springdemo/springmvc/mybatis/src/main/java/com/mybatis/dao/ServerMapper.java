package com.mybatis.dao;

import com.mybatis.model.Server;

public interface ServerMapper {
    Server selectByPrimaryKey(Integer id);
}