package com.eric_eldard.util;

/// @author eeldard
public final class ObjectUtils
{
    /// {@link java.util.Objects#equals Objects.equals}, except `false` is returned if both elements are `null`
    ///
    /// @return false if `a` is `null`; else, return `a.equals(b)`
    public static boolean nonNullEquals(Object a, Object b)
    {
        return a != null && a.equals(b);
    }

    private ObjectUtils()
    {
        // util ctor
    }
}