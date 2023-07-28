package com.lizza.auto.injection.service.strategy;

import com.lizza.auto.injection.service.strategy.enums.TableTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class SkuConsumer extends AbstractStrategy {

    @Override
    public TableTypeEnum type() {
        return TableTypeEnum.SKU_CONSUMER;
    }

    @Override
    public String handle() {
        return type().name();
    }
}
