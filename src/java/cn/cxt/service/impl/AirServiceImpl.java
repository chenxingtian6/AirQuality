package cn.cxt.service.impl;

import cn.cxt.dao.AirDao;
import cn.cxt.entity.Air;
import cn.cxt.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 空气质量指数业务类
 */
@Scope("prototype")
@Transactional
@Service("airService")
public class AirServiceImpl implements AirService {
    @Autowired(required =true)
    @Qualifier("airDao")
    private AirDao airDao;

    public void setAirDao(AirDao airDao) {
        this.airDao = airDao;
    }

    @Override
    public List<Air> getAirList(Air air) {
        return null;
    }

    @Override
    public boolean insert(Air air) {
        return false;
    }

    @Override
    public boolean update(Air air) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Air> getBydistrictId(Integer districtId) {
        List<Air> airList=airDao.selectBydistrctId(districtId);
        return airList!=null&&!airList.isEmpty()? (List<Air>) airList.get(0) :null;

    }
}
