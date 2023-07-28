import com.lizza.aop.LogAspect;
import com.lizza.dao.UserDao;
import com.lizza.util.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-05-25
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void test1() {
        userDao.delete();
    }

    @Test
    public void test2() {
        userDao.delete();
        userDao.save();
        userDao.select();
    }
}
