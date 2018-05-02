/*
 * Copyright © 2018 Samuel Holland <samuel@sholland.org>
 * SPDX-License-Identifier: GPL-2.0-or-later
 */

package com.wireguard.android.util;

/**
 * A list that is both sorted/keyed and observable.
 */

public interface ObservableSortedKeyedList<K, E extends Keyed<? extends K>>
        extends ObservableKeyedList<K, E>, SortedKeyedList<K, E> {
}
