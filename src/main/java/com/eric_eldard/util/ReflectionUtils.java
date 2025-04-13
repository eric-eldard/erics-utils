package com.eric_eldard.util;

import java.lang.reflect.Field;

public final class ReflectionUtils
{
    /// Gets the value of the field named `fieldName` from the given `obj`
    public static Object getField(Object obj, String fieldName)
        throws IllegalAccessException, NoSuchFieldException
    {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    /// Sets the value of the field named `fieldName` on the given `obj`
    public static void setField(Object obj, String fieldName, Object value)
        throws IllegalAccessException, NoSuchFieldException
    {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    private ReflectionUtils()
    {
        // util ctor
    }
}