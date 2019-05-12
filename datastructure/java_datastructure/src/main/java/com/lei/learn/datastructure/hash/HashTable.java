package com.lei.learn.datastructure.hash;

import java.util.Arrays;

public class HashTable {
    private HashStudentInfo[] data = new HashStudentInfo[100];

    public void put(HashStudentInfo hashStudentInfo) {
        //调取哈希函数，获取存储位置
        int index = hashStudentInfo.hashCode();
        data[index] = hashStudentInfo;

    }

    public HashStudentInfo get(HashStudentInfo hashStudentInfo) {
        return data[hashStudentInfo.hashCode()];

    }

    @Override
    public String toString() {
        return "HashTable{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
