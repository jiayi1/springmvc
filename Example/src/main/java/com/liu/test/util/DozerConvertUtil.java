package com.liu.test.util;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.List;

/**
 * Created by yulong.liu on 2016/12/27.
 */
public class DozerConvertUtil {
    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    private static DozerBeanMapper dozer = null;

    static {
        dozer = new DozerBeanMapper();
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public static <F, T> List<T> convertList(final Collection<F> sourceList, final Class<T> destinationClass) {
        if (sourceList == null) {
            return null;
        }
        List<T> destinationList = Lists.newArrayList();
        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

}
