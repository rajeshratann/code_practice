package code.practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingChar {
     public static void main(String[] args) {
        String str="abcabcdef";

        Character result =str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(val->val.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
         System.out.println(result);
    }
}
