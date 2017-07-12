package com.unionx.sbt.service;

import com.unionx.sbt.dao.SysUserMapper;
import com.unionx.sbt.po.SysUser;
import com.unionx.sbt.po.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务类
 * <p>
 * Created by walden on 2017/7/12.
 */
@Service
public class UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public void test() {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsernameEqualTo("admin");
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        System.out.println(sysUsers);
    }
}
