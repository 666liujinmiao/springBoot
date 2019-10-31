import com.dfbz.MySpringBootApplication;
import com.dfbz.dao.UserDao;
import com.dfbz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestSpringbootRedis {

    @Autowired
    UserDao dao;

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Test
    public void test1(){
        List<User> userList = dao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        Object userList = redisTemplate.opsForValue().get("userList");
        if (userList!=null){
            System.out.println("取出数据......");
            System.out.println(userList);
        }else{
            redisTemplate.opsForValue().set("userList",dao.findAll().toString());
        }
    }
}
