package com.jscloud;

import org.junit.Test;

import java.util.*;

public class GlobalApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        B b = new B();
        b.scan(); // B.doScan
        A a = new B();
        a.doScan(); // B.doScan
    }

    static class B extends A {
        @Override
        protected void doScan() {
            System.out.println("B.doScan");
        }
    }

    static class A {
        public void scan() {
            doScan();
        }

        protected void doScan() {
            System.out.println("A.doScan");
        }
    }

    @Test
    public void test_two_sum() {
        int target = 9;
        int[] nums = {1, 2, 3, 4, 5, 9};
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arrayList.add(i);
                    arrayList.add(j);
                }
            }
        }
        System.out.println(arrayList);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(val);
            while (next != null) {
                list.add(next.val);
            }
            return list.toString();
        }
    }

    @Test
    public void addTwoNumbers() {
        ListNode l1 = null, l2 = null;
        ListNode list_1 = new ListNode(1);
        ListNode list_2 = new ListNode(5);
        ListNode list_3 = new ListNode(3);
        list_1.next = list_2;
        list_2.next = list_3;

        ListNode list2_1 = new ListNode(2);
        ListNode list2_2 = new ListNode(6);
        ListNode list2_3 = new ListNode(8);
        list2_1.next = list2_2;
        list2_2.next = list2_3;

        l1 = list_1;
        l2 = list2_1;

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // 创建新节点
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
//        return dummyHead.next;

        System.out.println(cur);
    }

    @Test
    public void test_binary_search() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);//
        //Collections.sort(list,Collections.reverseOrder());
        //System.out.println(list);//
        //int binary_index = Collections.binarySearch(list, "aaa");
        //System.out.println(binary_index);
        Collections.shuffle(list);
        System.out.println(list);
    }
    @Test
    public void test_rotate() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        list.set(2,"d");

//        Collections.shuffle(list);
        Collections.rotate(list,2);
        System.out.println(list);
        String max = Collections.max(list);
        String min = Collections.min(list);

        List<Object> list_1 = Collections.synchronizedList(new ArrayList<>());
        Collections.synchronizedMap(new HashMap<>());
    }
}
