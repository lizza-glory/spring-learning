package com.lizza.auto.injection.service.strategy;

import com.lizza.auto.injection.service.strategy.enums.TableTypeEnum;

/**
 * 抽象策略类
 * 场景: 该服务监听消费 binlog, 有三张表: spu, sku, image
 * 构建三个策略类来根据表名消费不同的表, 实现良好的扩展性
 */
public abstract class AbstractStrategy {

    public abstract TableTypeEnum type();

    public abstract String handle();
}
