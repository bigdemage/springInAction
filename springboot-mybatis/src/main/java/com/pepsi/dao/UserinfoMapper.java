package com.pepsi.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.pepsi.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


@Mapper
public interface UserinfoMapper{

    public int insert(Userinfo userinfo);
    
    public int deletes(@Param("ids") Long[] ids);
    
    public int delete(@Param("id") Long id);
    
    public PageList<Userinfo> findUserinfoListByPage(PageBounds pageBounds, Map<String, Object> conditionMap) ;
    
    public Userinfo findUserinfoById(@Param("id") Long id);
    
    public int update(Userinfo userinfo);
    
    public Userinfo findUserinfoByIdAndCodeName(Map<String, Object> conditionMap);
    
    public int updateEnables(@Param("ids") Long[] ids, @Param("enables") int enables, @Param("updateId") Long updateId);
    
    public Userinfo findUserinfoByIdAndStatus(Map<String, Object> conditionMap);
}
    
