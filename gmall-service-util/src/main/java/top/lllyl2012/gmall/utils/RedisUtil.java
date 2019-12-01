package top.lllyl2012.gmall.utils;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
    private JedisPool jedisPool;

    public void initPool(String host,int port,int database) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(200);
        jedisPoolConfig.setMaxIdle(30);
        jedisPoolConfig.setBlockWhenExhausted(true);
        jedisPoolConfig.setMaxWaitMillis(10 * 1000);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPool = new JedisPool(jedisPoolConfig, host, port, 20 * 1000);
    }

    public Jedis getRedis() {
        return jedisPool.getResource();
    }
}
