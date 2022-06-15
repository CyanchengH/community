package com.newcoder.community.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
@Repository("alphaHibernate")

public class AlphaDaoHibertelmpl implements AlphaDao{
    @Override
    public String select(){
        return "Hibernate";

    }
}
