package org.seckill.dao.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by heng on 2017/6/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/spring-dao.xml"})
@Transactional
public class BaseMapperTestConfig {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        System.out.println(userRoleMapper.selectByPrimaryKey(1));
    }
}
