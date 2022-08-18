package com.nowcoder.community.dao;

import com.nowcoder.community.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}

