package cn.itbat.whh.taskcenter.service.impl;

import cn.itbat.whh.taskcenter.BaseTest;
import cn.itbat.whh.usercenter.model.CmUser;
import cn.itbat.whh.usercenter.service.CmUserService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class CmUserTaskServiceImplTest extends BaseTest {

    @Resource
    private CmUserService cmUserService;

    @Test
    public void test() {
        CmUser cmUser = cmUserService.getCmUserByUserId(1L);
        System.out.println(cmUser);
    }
}