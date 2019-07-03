package cn.cxt.dao;

import cn.cxt.entity.Air;

import java.util.List;

/**
 * 空气质量指数持久化接口
 */
public interface AirDao {
    public List<Air> selectAll();//查询全部

    public Air selectByid(Integer id);//根据id查询

    public int insert(Air air);//添加

    public int uodate(Air air);//更新

    public int del(Integer id);//删除

    public List<Air> selectBydistrctId(Integer distrctId);
}
