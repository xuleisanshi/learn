package com.lei.learn.datastructure.Tree;

public class BinarySortTreeTest {
    public static void main(String[] args) {
        int[] array = new int[]{7, 3, 10, 12, 5, 1, 9, 4, 6, 8};

        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i : array) {
            binarySortTree.add(new TreeNode(i));
        }

        binarySortTree.midShow();

        System.out.println("============================================================");
        System.out.println(binarySortTree.search(10));
        System.out.println(binarySortTree.searchParent(9));
        System.out.println("============================================================");
//        binarySortTree.midShow();
//        binarySortTree.delete(12);
        System.out.println("============================================================");
        binarySortTree.midShow();
        binarySortTree.delete(1);
        System.out.println("============================================================");
        binarySortTree.midShow();
        System.out.println("============================================================");
        binarySortTree.delete(3);
        binarySortTree.midShow();
        System.out.println("============================================================");
        binarySortTree.delete(12);
        binarySortTree.midShow();
        System.out.println("============================================================");
        binarySortTree.delete(10);
        binarySortTree.midShow();


    }
}
