package cn.cxt.service.impl;

import cn.cxt.dao.AirDao;
import cn.cxt.dao.DistrictDao;
import cn.cxt.entity.District;
import cn.cxt.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 区域业务类
 */
@Scope("prototype")
@Transactional
@Service("districtService")
public class DistrictServiceImpl implements DistrictService {
    @Autowired(required =true)
    @Qualifier("districtDao")
    private DistrictDao districtDao;

    public void setDistrictDao(DistrictDao districtDao) {
        this.districtDao = districtDao;
    }

    @Override
    public List<District> getAll() {
        return null;
    }
}
