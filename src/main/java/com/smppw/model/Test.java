package com.smppw.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
   
        List<Author> list = getAuthors();
        list.stream()
                .filter((author)->author.getName().length()>1)
                .forEach((e)->{
            System.out.println(e);
        });
        //数据类型转换
        test01();
        System.out.println("=============");
        test02();
        System.out.println("=============");
        test03();
        System.out.println("======================");
        test04();
        System.out.println("============================");
        test05();
        System.out.println("============================");
        List<Integer> list100 = Arrays.asList(1,2,32,2,3);
        System.out.println(list100.stream().distinct().collect(Collectors.toList()));

        
    }

    private static void test05() {
        List<Author> list = getAuthors();

        list.stream().map((e)->e.getBooks()).collect(Collectors.toList()).stream().distinct().forEach(System.out::println);
    }

    private static void test04() {
        List<Author> list = getAuthors();
        list.stream().distinct()
                .sorted((e1,e2)->e2.getAge() - e1.getAge()).limit(2).forEach((e)-> System.out.println(e.getName()));
    }

    private static void test03() {
        List<Author> list = getAuthors();
        list.stream()
                .distinct()
                .sorted((e1,e2)-> e1.getAge() - e2.getAge())
                .forEach(System.out::println);
    }

    public static void test02() {
        List<Author> list = getAuthors();
        list.stream().distinct().forEach(System.out::println);

    }
    private static void test01() {
        List<Author> list = getAuthors();
        List<Integer> list2 = list.stream()
                .map((author-> author.getAge() + 100))
                .collect(Collectors.toList());
        System.out.println(list2);
    }

    static Author author = new Author(1L,"aaa",25,"sdds",null);
    static Author author2 = new Author(2L,"bbb",23,"sdds",null);
    static Author author3 = new Author(3L,"ccc",24,"sdds",null);
    static Author author4 = new Author(3L,"ccc",24,"sdds",null);

    //        Author author4 = new Author(4L,"ddd",28,"sdds",null);
    /*
     *
     * */
    static ArrayList<Book> books1 = new ArrayList();
    static ArrayList<Book> books2 = new ArrayList();
    static ArrayList<Book> books3 = new ArrayList();
    static {
        books1.add(new Book(1L,"b1","x",88,"ccc"));
        books1.add(new Book(2L,"b2","x",83,"ccc"));
        books2.add(new Book(3L,"b3","x",83,"ccc"));
        books2.add(new Book(4L,"b4","x",83,"ccc"));
        books2.add(new Book(5L,"b5","x",83,"ccc"));

        books3.add(new Book(6L,"b6","x",83,"ccc"));
        books3.add(new Book(7L,"b7","x",83,"ccc"));
        books3.add(new Book(8L,"b8","x",83,"ccc"));
        books3.add(new Book(9L,"b9","x",83,"ccc"));
        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

    }

    public static List<Author> getAuthors() {
        ArrayList<Author> list = new ArrayList<>();
        list.add(author);
        list.add(author2);
        list.add(author3);
        list.add(author4);
        return list;
    }
}
