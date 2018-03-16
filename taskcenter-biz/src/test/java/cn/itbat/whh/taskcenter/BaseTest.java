package cn.itbat.whh.taskcenter;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 所有单元测试继承 BaseTest
 * @author huahui.wu.
 *         Created on 2018/1/10.
 */
@ContextConfiguration(locations = "classpath*:spring-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BaseTest {
}
