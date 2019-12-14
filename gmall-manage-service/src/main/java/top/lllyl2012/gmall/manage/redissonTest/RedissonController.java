package top.lllyl2012.gmall.manage.redissonTest;

import org.apache.commons.lang3.StringUtils;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import top.lllyl2012.gmall.utils.RedisUtil;

@RestController
public class RedissonController {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedissonClient redissonClient;

    @RequestMapping("testRedisson")
    public String testRedisson() {
        Jedis jedis = redisUtil.getRedis();
        RLock lock = redissonClient.getLock("lock");
        lock.lock();
        try{
            String v = jedis.get("k");
            if (StringUtils.isEmpty(v)) {
                v = "1";

            }
            System.out.println(v);
            jedis.set("k",(Integer.parseInt(v)+1)+"");

        }finally {
            jedis.close();
            lock.unlock();
        }
        return "ok";
    }
}
