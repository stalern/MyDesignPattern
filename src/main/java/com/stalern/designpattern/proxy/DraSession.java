package com.stalern.designpattern.proxy;

/**
 * Dra是一个ORM框架，DraSession是对数据库的一次连接
 * @author stalern
 * @date 2019/11/27~14:26
 */
public interface DraSession {
    /**
     * 连接的查询
     * @return 查询结果
     */
    String query();
}
