package com.eric_eldard.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class SetUtils
{
    /// @return a mutable `Set` of the elements (as opposed to the immutable version returned by {@link Set#of})
    public static <T> Set<T> modifiableSetOf(T... elements)
    {
        return Arrays.stream(elements).collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    private SetUtils()
    {
        // util ctor
    }
}