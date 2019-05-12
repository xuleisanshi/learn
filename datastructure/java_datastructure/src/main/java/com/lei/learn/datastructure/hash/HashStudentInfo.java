package com.lei.learn.datastructure.hash;

/**
 * a demo for hash
 */
public class HashStudentInfo {
    private int age;
    private int count;

    public HashStudentInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * hash function
     */
    public int hashCode() {
        return age;
    }

    public HashStudentInfo(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "HashStudentInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
