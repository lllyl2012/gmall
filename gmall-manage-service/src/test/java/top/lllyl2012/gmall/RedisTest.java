package top.lllyl2012.gmall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import top.lllyl2012.gmall.utils.RedisUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GmallManageApplication.class)
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void getRedis() {
        Jedis redis = redisUtil.getRedis();
        System.out.println(redis);

    }
}
