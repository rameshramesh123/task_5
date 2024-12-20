package task5;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class solution2 {
    public static void main(String[] args) {
        List<String> liststrings= Arrays.asList("abb","","bc","efg","abcd","","kjl");
        List<String> list=liststrings.stream().filter(s-> !Objects.equals(s, "")).collect(Collectors.toList());
        System.out.println(list);

    }
}
