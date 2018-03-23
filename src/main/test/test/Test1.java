package test ;

import com.tanoak.dao.HelloDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA
 *
 * @author tanoak
 * @date 2018/3/23
 * @desc
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class Test1 {

    @Resource
    private HelloDao helloDao ;
    @Test
    public void test1(){
        System.out.println( helloDao.findById("1").toString());
    }
}
