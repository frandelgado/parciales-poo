package com.company.par2_18_02.ej2;

public interface DoubleKeyMap<K1,K2,V> {

    int size();

    boolean isEmpty();

    boolean containsKey(K1 firstKey, K2 secondKey);

    boolean containsValue(V value);

    V get(K1 firstKey, K2 secondKey);

    void put(K1 firstKey, K2 secondKey, V value);

}