package cn.cxt.dao.impl;

import cn.cxt.dao.DistrictDao;
import cn.cxt.entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;

@Scope("DistrictService")
@Transactional
public class DistrictDaoImpl implements DistrictDao {
    @Autowired
    @Qualifier("DistrictDao")
    private DistrictDao districtDao;

    public void setDistrictDao(DistrictDao districtDao) {
        this.districtDao = districtDao;
    }

    @Override
    public District selectAll() {
        return null;
    }
}
