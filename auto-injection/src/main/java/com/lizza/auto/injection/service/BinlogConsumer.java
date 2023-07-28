package com.lizza.auto.injection.service;

import com.lizza.auto.injection.entity.Binlog;
import com.lizza.auto.injection.service.strategy.AbstractStrategy;
import com.lizza.auto.injection.service.strategy.enums.TableTypeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class BinlogConsumer {

    @Resource
    private Map<String, AbstractStrategy> strategyMap;

    public String handle(Binlog entity) {
        AbstractStrategy strategy = strategyMap.get(TableTypeEnum.of(entity.getTableName()).strategy);
        return strategy.handle();
    }
}
