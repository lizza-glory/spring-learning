import com.lizza.config.SpringConfig;
import com.lizza.service.AbstractUserService;
import com.lizza.service.OrderService;
import com.lizza.service.UserServiceFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class IocTest {

    @Resource
    private UserServiceFactory userServiceFactory;
    
    @Resource
    private OrderService orderService;

    @Test
    public void test1() {
        AbstractUserService userService = userServiceFactory.get("Student");
        System.out.println(userService.userType());
    }

    /**
     * 测试 spring mvc 父子容器
     * service 访问 controller
     */
    @Test
    public void test2() throws Exception {
        System.out.println(orderService.hello());
    }
}
