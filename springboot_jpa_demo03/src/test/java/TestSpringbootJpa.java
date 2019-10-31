import com.dfbz.MySpringBootApplication;
import com.dfbz.dao.UserDao;
import com.dfbz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestSpringbootJpa {

    @Autowired
    UserDao dao;

    @Test
    public void test1(){
        List<User> userList = dao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
