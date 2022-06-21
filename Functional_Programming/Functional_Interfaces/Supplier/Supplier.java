/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package Functional_Programming.Functional_Interfaces.Supplier;

/**
 * Represents a supplier of results.

 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.

 * This is a functional interface  whose functional method is

               get()

 * @param <T> the type of results supplied by this supplier

 * @since 1.8
 */
@FunctionalInterface
public interface Supplier<T> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    T get();
}
