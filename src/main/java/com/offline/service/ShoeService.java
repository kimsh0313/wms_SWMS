package com.offline.service;

import com.offline.dao.ShoeMapper;
import com.offline.dto.OfflineStackDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.offline.common.Template.getSqlSession;

public class ShoeService {
    private ShoeMapper shoeMapper;
    public List<OfflineStackDto> shoesSearch(String code){
        SqlSession sqlSession = getSqlSession();
        shoeMapper = sqlSession.getMapper(ShoeMapper.class);
        List<OfflineStackDto> offStack = shoeMapper.shoesSearch(code);
        sqlSession.close();
        return offStack;
    }
}
