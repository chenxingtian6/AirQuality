package cn.cxt.dao.impl;

import cn.cxt.dao.AirDao;
import cn.cxt.entity.Air;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class AirDaoImpl implements AirDao {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Air> selectAll() {
        return null;
    }

    @Override
    public Air selectByid(Integer id) {
        return null;
    }

    @Override
    public int insert(Air air) {
        return 0;
    }

    @Override
    public int uodate(Air air) {
        return 0;
    }

    @Override
    public int del(Integer id) {
        return 0;
    }

    @Override
    public List<Air> selectBydistrctId(Integer district) {
        return sqlSession.selectList("cn.cxt.dao.AirDao.selectAir",district);
    }
}
