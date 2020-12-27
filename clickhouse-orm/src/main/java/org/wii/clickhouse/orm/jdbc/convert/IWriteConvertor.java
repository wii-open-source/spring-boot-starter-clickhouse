package org.wii.clickhouse.orm.jdbc.convert;

import java.util.List;
import java.util.Map;

/**
 * @author tanghong
 * @Desc
 * @Date 27/12/2020 21:58
 */
public interface IWriteConvertor {
    <T> String insertValueToSql(String sql, String valueExpress, List<T> list);

    <T> String insertToSql(String table, String columnTuple, String valueExpress, List<T> list);

    <T> String insertToSqlForAnnotation(Class<T> requireType, String columnTuple, List<T> list);

    String queryToSql(String sql, Map<String, Object> params);

    String queryToSql(String sql, Object object);
}