package cn.watchthefun.sample.spring.bean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther geyx
 * @date 2019/12/30
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class BeanTest {

    @Before
    public void before() {
        System.out.println("====== before ======");
    }

    @After
    public void after() {
        System.out.println("====== after ======");
    }

    /**
     * 测试 AnnotationConfigApplicationContext 初始化
     */
    @Test
    public void testConfigBean() {
        // 使用 @Configuration 注解修饰的 bean 进行初始化
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBean.class);
//        Bean1 bean = context.getBean(Bean1.class);
//        bean.setName("bean1");
//        System.out.println(bean);
    }
}
