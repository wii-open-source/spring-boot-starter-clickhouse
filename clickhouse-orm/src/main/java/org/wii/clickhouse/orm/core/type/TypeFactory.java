package org.wii.clickhouse.orm.core.type;

import java.util.List;
import java.util.Properties;

public interface TypeFactory {
    void setProperties(Properties properties);

    <T> T create(Class<T> type);

    <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs);

    <T> boolean isCollection(Class<T> type);
}