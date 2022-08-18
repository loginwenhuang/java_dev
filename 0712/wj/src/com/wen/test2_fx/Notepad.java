package com.wen.test2_fx;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 15:02
 */
public class Notepad<K,V>{
    private K key;
    private V value;

    public Notepad(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
