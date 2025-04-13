package com.eric_eldard.util;

import java.util.Iterator;
import java.util.function.BiConsumer;

/// For-each-with-index functionality for any iterable or array.
///
/// Bear in mind that for inherently unordered iterables, like sets, the index plays the role of counter, but doesn't
/// indicate the position of an element relative to its siblings.
///
/// For arrays, the index is represented with an `Integer`, since the maximum size of an array is
/// {@link Integer#MAX_VALUE}. For iterables, the index is represented by a `Long`, as these don't have an inherent
/// size restriction (despite {@link java.util.Collection#size Collection.size's} representation as a `int`).
///
/// Usage
/// ```
/// List<String> iterable = List.of("alpha", "bravo", "charlie");
/// For.i(iterable, (elem, i) -> System.out.println(i + ". " + elem));
/// ```
/// ```
/// 0. alpha
/// 1. bravo
/// 2. charlie
/// ```
///
/// @author eeldard
public final class For
{
    public static <T> void i(Iterable<T> iterable, BiConsumer<T, Long> consumer)
    {
        Iterator<T> iterator = iterable.iterator();
        long i = 0; // faster & more efficient to perform increment on a primitive, and then autobox while passing as an
                    // arg, than it would be to start as a Long, unbox to increment, and then autobox the result back to
                    // a new Long, before passing as arg
        while (iterator.hasNext())
        {
            consumer.accept(iterator.next(), i++);
        }
    }

    public static <T> void i(T[] array, BiConsumer<T, Integer> consumer)
    {
        for (int i = 0; i < array.length; i++)
        {
            consumer.accept(array[i], i);
        }
    }

    private For()
    {
        // util ctor
    }
}