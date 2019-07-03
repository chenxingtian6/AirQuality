package cn.cxt.service;

import cn.cxt.entity.Air;

import java.util.List;

/**
 * 空气质量指数业务操作接口
 */
public interface AirService {
    public List<Air> getAirList(Air air);//查询

    public boolean insert(Air air);//添加

    public boolean update(Air air);//更新

    public  boolean delete(Integer id);//删除

    public List<Air> getBydistrictId(Integer districtId);
}
