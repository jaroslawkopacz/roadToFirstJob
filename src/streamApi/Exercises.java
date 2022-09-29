package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {
        List<Integer> integers = List.of(8);
        System.out.println(square56(integers));
    }

//    Zadanie 5: Liczby do kwadratu
//
//    Mając listę liczb całkowitych, zwróć listę tych liczb do kwadratu
//    i do każdej z nich dodaj 10, pomijając wszystkie wynikowe liczby, które kończą się na 5 lub 6 (16,25 itp.).
//
//    Na przykład:
//    square56([3, 1, 4]) → [19, 11]
//    square56([1]) → [11]

    public static List<Integer> square56(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n * n + 10)
                .filter(n -> n%10 != 6 && n%10 != 5 )
                .collect(Collectors.toList());
    }







}
