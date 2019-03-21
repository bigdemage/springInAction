package com.pepsi.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.pepsi.dao.UserinfoMapper;
import com.pepsi.pojo.Userinfo;
import com.pepsi.service.UserinfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;


@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoMapper userinfoMapper;
    
    @Override
    public void insert(Userinfo userinfo){
        int flag = userinfoMapper.insert(userinfo);
    }
    
    
    @Override
    public PageList<Userinfo> findUserinfoListByPage(int curPage,int pageSize,Map<String,Object> conditionMap)  {
        
        PageBounds pageBounds = new PageBounds(curPage,pageSize,true);
        PageList<Userinfo> userinfoList=new PageList<>();
        try {
            userinfoList = userinfoMapper.findUserinfoListByPage(pageBounds,conditionMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userinfoList;
    }
    
    @Override
    public Userinfo findUserinfoById(Long id) {
        return userinfoMapper.findUserinfoById(id);
    }


    @Transactional //标识有事务
    @Override
    public void updateById(Userinfo  userinfo) {
        int flag = userinfoMapper.update( userinfo);
    }


    @Override
    public void deletes(Long[] ids) {
        if(ids==null||ids.length==0){
            throw new IllegalArgumentException("ids数组不能为空");
        }
        int flag = 0;
        if(ids.length==1){
            flag= userinfoMapper.delete(ids[0]);
        }else{
            flag = userinfoMapper.deletes(ids);
        }
      
    }
    
    @Override
    public void updateEnables(Long[] ids, int enables, Long updateId){
        int flag = userinfoMapper.updateEnables(ids, enables, updateId);
        if(flag <= 0){
        }
    }
    
    @Override
    public boolean findUserinfoByIdAndStatus(Map<String, Object> conditionMap){
        boolean flag = false;
        Userinfo userinfo = userinfoMapper.findUserinfoByIdAndStatus(conditionMap);
        if(userinfo != null){
            flag = true;
        }
        
        return flag;
    }

}
