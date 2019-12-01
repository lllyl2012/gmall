package top.lllyl2012.gmall.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lllyl2012.gmall.utils.RedisUtil;

@Configuration
public class RedisConfig {
    @Value("${spring.redis.host:disabled}")
    private String host;

    @Value("${spring.redis.port:0}")
    private int port;

    @Value("${spring.redis.database:0}")
    private int database;

    @Bean
    public RedisUtil getRedisUtil() {
        if (host.equals("disables")) {
            return null;
        }
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.initPool(host, port, database);
        return redisUtil;
    }
}
