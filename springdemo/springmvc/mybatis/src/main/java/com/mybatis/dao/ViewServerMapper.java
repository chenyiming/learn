package com.mybatis.dao;

import com.mybatis.model.ViewServer;
import com.mybatis.model.ViewServerExample;
import java.util.List;

public interface ViewServerMapper {
    long countByExample(ViewServerExample example);

    List<ViewServer> selectByExampleWithBLOBs(ViewServerExample example);

    List<ViewServer> selectByExample(ViewServerExample example);
}