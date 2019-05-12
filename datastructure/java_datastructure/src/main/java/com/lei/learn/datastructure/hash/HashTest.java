package com.lei.learn.datastructure.hash;

import java.util.Arrays;

public class HashTest {
    public static void main(String[] agrs) {
        HashStudentInfo hashStudentInfo = new HashStudentInfo(16, 3);
        HashStudentInfo hashStudentInfo1 = new HashStudentInfo(17, 11);
        HashStudentInfo hashStudentInfo2 = new HashStudentInfo(18, 23);
        HashStudentInfo hashStudentInfo3 = new HashStudentInfo(19, 24);
        HashStudentInfo hashStudentInfo4 = new HashStudentInfo(20, 9);

        HashTable hashTable = new HashTable();
        hashTable.put(hashStudentInfo);
        hashTable.put(hashStudentInfo1);
        hashTable.put(hashStudentInfo2);
        hashTable.put(hashStudentInfo3);
        hashTable.put(hashStudentInfo4);

        //获取目标数据

        System.out.println(hashTable);

        HashStudentInfo target = new HashStudentInfo(18);
        HashStudentInfo info = hashTable.get(target);
        System.out.println(info);
    }
}
