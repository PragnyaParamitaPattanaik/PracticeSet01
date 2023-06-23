package Java8Practicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem01 {
    public static void fetchcommonElement(int[] arr1, int[]arr2){
        List<Integer> commonElements= Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(arr2Number->arr2Number==number)).boxed().collect(Collectors.toList());
        System.out.println("Common Elements in Arrays:"+commonElements);

    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,5,1};
        fetchcommonElement(arr1,arr2);

    }
}
