package com.huawei.linkedlist;

/**
 * 单链表
 */
public class SingleLinkedList {
    // 链表的大小
    private int size;
    // 链表的头节点
    private Node head;

    private class Node {
        // 节点的数据域
        private Object data;
        // 指向下一个节点的指针
        private Node next;
        public Node(Object obj) {
            this.data = obj;
            this.next = null;
        }
    }

    /**
     * 单链表构造函数
     */
    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    /**
     * 链表节点个数
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return (size == 0);
    }
}
