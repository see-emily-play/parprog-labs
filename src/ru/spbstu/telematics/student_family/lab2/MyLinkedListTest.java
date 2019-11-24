package ru.spbstu.telematics.student_family.lab2;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void getSize() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("Hello World!");
        expected.addLast("Bye!");
        Assert.assertEquals(expected.getSize(), 2);
    }

    @Test
    public void getFirst() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        String actual="Hello World!";
        expected.addFirst("Hello World!");
        Assert.assertEquals(expected.getFirst(), actual);
    }

    @Test
    public void getLast() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        String actual="Hello World!";
        expected.addLast("Java");
        expected.addLast("Hello World!");
        Assert.assertEquals(expected.getLast(), actual);
    }

    @Test
    public void addFirst() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("string");

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addFirst("string");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addLast() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addLast("string");

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addLast("string");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFirst() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("Hello World!");
        expected.addFirst("string");
        expected.removeFirst();

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addFirst("Hello World!");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeLast() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("Hello World!");
        expected.addFirst("string");
        expected.removeLast();

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addFirst("string");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("string 2");
        expected.addFirst("Hello World!");
        expected.addFirst("string");

        expected.remove(1);

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addFirst("string 2");
        actual.addFirst("string");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.add(0, "string");

        MyLinkedList<String> actual=new MyLinkedList<>();
        actual.addFirst("string");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        MyLinkedList<String> expected=new MyLinkedList<>();
        expected.addFirst("Hello World!");
        Assert.assertTrue(expected.contains("Hello World!"));
    }

    @Test
    public void equals(){
        MyLinkedList<String> list1=new MyLinkedList<>();
        list1.addFirst("Hello World!");
        list1.addFirst("Bye");

        MyLinkedList<String> list2=new MyLinkedList<>();
        list2.addFirst("Hello World!");
        list2.addFirst("Bye");

        Assert.assertEquals(list1, list2);
    }
}