package task5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1 {
    public static void main(String[] args) {

                Stream<String> names = Stream.of("aBc", "d", "ef");

                List<String> upperCaseNames = names
                        // Convert each string to uppercase
                        .map(String::toUpperCase)
                        // Collect the result into a list
                        .collect(Collectors.toList());


                System.out.println(upperCaseNames);
            }
        }


