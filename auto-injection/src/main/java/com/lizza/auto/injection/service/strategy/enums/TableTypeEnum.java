package com.lizza.auto.injection.service.strategy.enums;

import java.util.stream.Stream;

public enum TableTypeEnum {
    SPU_CONSUMER("spu", "spuConsumer"),
    SKU_CONSUMER("sku", "skuConsumer"),
    IMAGE_CONSUMER("image", "imageConsumer");

    public final String code;
    public final String strategy;

    TableTypeEnum(String code, String strategy) {
        this.code = code;
        this.strategy = strategy;
    }

    public static TableTypeEnum of(String code) {
        return Stream.of(TableTypeEnum.values())
                .filter(e -> e.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
