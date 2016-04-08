package com.airshiplay.mybtis.interceptor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * 驼峰Interceptor
 * 
 * @author lig
 *
 */
@Intercepts(@Signature(type = Executor.class, method = "query", args = {
		MappedStatement.class, Object.class, RowBounds.class,
		ResultHandler.class }))
public class CameHumpInterceptor implements org.apache.ibatis.plugin.Interceptor {

	@SuppressWarnings("unchecked")
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		// 先执行，后处理
		List<Object> list = (List<Object>) invocation.proceed();
		for (Object object : list) {
			if (object instanceof Map) {
				processMap((Map<Object, Object>) object);
			} else {
				break;
			}
		}
		return list;
	}

	/**
	 * 
	 * 处理简单对象
	 * 
	 *
	 * 
	 * @param map
	 */
	private void processMap(Map<Object, Object> map) {
		Map<Object, Object> cameHumpMap = new HashMap<Object, Object>();
		Iterator<Entry<Object, Object>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<?, ?> entry = iterator.next();
			String key = (String) entry.getKey();
			String cameHumpKey = underlineToCamelhump(key.toLowerCase());
			if (!key.equals(cameHumpKey)) {
				cameHumpMap.put(cameHumpKey, entry.getValue());
				iterator.remove();
			}
		}
		map.putAll(cameHumpMap);
	}

	/**
	 * 
	 * 将下划线风格替换为驼峰风格
	 * 
	 *
	 * 
	 * @param str
	 * 
	 * @return
	 */
	public static String underlineToCamelhump(String str) {
		Matcher matcher = Pattern.compile("_[a-z]").matcher(str);
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0; matcher.find(); i++) {
			builder.replace(matcher.start() - i, matcher.end() - i, matcher
					.group().substring(1).toUpperCase());
		}
		if (Character.isUpperCase(builder.charAt(0))) {
			builder.replace(0, 1,
					String.valueOf(Character.toLowerCase(builder.charAt(0))));
		}
		return builder.toString();
	}

	@Override
	public Object plugin(Object target) {
		if (target instanceof ResultSetHandler) {
			return Plugin.wrap(target, this);
		}
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}
}
