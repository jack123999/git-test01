package com.smppw.fliter.test;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Data
@Builder
class User {
    String userId;
    Integer age;
}
public class Test001 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaac","bbb","ccc");
        List<String> list2 = list.stream()
                .filter(s -> s.startsWith("c"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
