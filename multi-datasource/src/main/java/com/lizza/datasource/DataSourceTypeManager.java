package com.lizza.datasource;

/**
 * @Desc: 数据源类型管理器
 * @author: lizza.liu
 * @date: 2021-03-13
 */
public class DataSourceTypeManager {

    private static ThreadLocal<DataSourceType> dataSourcesThreadLocal =
            ThreadLocal.withInitial(() -> DataSourceType.DS_GOODS);

    public static DataSourceType get() {
        return dataSourcesThreadLocal.get();
    }

    public static void set(DataSourceType dataSourceType) {
        dataSourcesThreadLocal.set(dataSourceType);
    }

    public static void reset() {
        dataSourcesThreadLocal.set(DataSourceType.DS_GOODS);
    }
}
