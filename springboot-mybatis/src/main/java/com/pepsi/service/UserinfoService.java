package com.pepsi.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.pepsi.pojo.Userinfo;

import java.util.Map;

public interface UserinfoService  {

	public void insert(Userinfo userinfo);
  
	public PageList<Userinfo> findUserinfoListByPage(int curPage, int pageSize, Map<String, Object> conditionMap);

    public Userinfo findUserinfoById(Long id);

    public void updateById(Userinfo userinfo);

    public void deletes(Long[] ids);
    
    public void updateEnables(Long[] ids, int enables, Long updateId);

    public boolean findUserinfoByIdAndStatus(Map<String, Object> conditionMap);
}
