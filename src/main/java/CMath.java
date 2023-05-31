import java.util.*;

public class CMath {
    public static boolean isPrime(int num) {
//        int count = 0;
//        for(int i = 1; i < num; i++) {
//            if (num % i == 0) count++;
//        }
        int count = factorsOf(num).size();
        return (count == 1);
    }

    public static boolean isPerpectionNumber(int num) {
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0)
//                numbers.add(i);
//        }
//
//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum += numbers.get(i);
//        }
        List<Integer> numbers = factorsOf(num);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return (sum == num);
    }

//    public static String factors(int num) {
        private static List<Integer> factorsOf(int num) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    numbers.add(i);
            }
//            return numbers.toString();
            return numbers;
        }

        public static String factors(int num) {
            return factorsOf(num).toString();
        }
    }
