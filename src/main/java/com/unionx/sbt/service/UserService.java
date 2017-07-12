package com.unionx.sbt.service;

import com.unionx.sbt.mapper.SysUserMapper;
import com.unionx.sbt.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
        SysUser sysUsers = sysUserMapper.selectByPrimaryKey(1L);
        System.out.println("--------------------->");
        System.out.println(sysUsers);
        System.out.println("--------------------->");
    }
}
