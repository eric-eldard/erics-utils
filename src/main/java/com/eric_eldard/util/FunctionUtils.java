package com.eric_eldard.util;

public final class FunctionUtils
{
    /// For `input`, return `input` (straight pass-through)
    public static <T> T noop(T input)
    {
        return input;
    }

    /// For `input` return `true`
    ///
    /// Useful when a `Predicate` is required, and you want to return `true` for any case
    public static boolean alwaysTrue(Object input)
    {
        return true;
    }

    /// For `input` return `false`
    ///
    /// Useful when a `Predicate` is required, and you want to return `false` for any case
    public static boolean alwaysFalse(Object input)
    {
        return false;
    }

    /// For `a` and `b`, return `a`
    ///
    /// For use as a merge function when the given elements are expected to be truly identical, or for when the choice
    /// of element doesn't matter, and you just need a merge to not fail
    public static <T> T takeFirst(T a, T b)
    {
        return a;
    }

    private FunctionUtils()
    {
        // util ctor
    }
}