package task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("avinash","manoj","ramesh","arjun","kiran","arjun","avinash","naveen","jay","Aswin");
        List<String> list1= (List<String>) list.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(list1);

    }
}
