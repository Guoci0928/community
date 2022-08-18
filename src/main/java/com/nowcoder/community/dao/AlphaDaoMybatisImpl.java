package com.nowcoder.community.dao;

import com.nowcoder.community.AlphaDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao {

    @Override
    public String select() {
        return "Mybatis";
    }
}
