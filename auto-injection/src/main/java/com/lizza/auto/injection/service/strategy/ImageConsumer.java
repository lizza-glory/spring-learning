package com.lizza.auto.injection.service.strategy;

import com.lizza.auto.injection.service.strategy.enums.TableTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class ImageConsumer extends AbstractStrategy {

    @Override
    public TableTypeEnum type() {
        return TableTypeEnum.IMAGE_CONSUMER;
    }

    @Override
    public String handle() {
        return type().name();
    }
}
