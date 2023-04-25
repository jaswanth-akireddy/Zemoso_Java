import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    static Pair<String, String> getFangs(String num_str) {

        List<String> num_vec = new ArrayList<>();
        for (char c : num_str.toCharArray()) {
            num_vec.add(String.valueOf(c));
        }
        Collections.sort(num_vec);
        do {
            String x_str = "", y_str = "";
            for (int i = 0; i < num_str.length() / 2; i++) {
                x_str += num_vec.get(i);
            }
            for (int i = num_str.length() / 2; i < num_str.length(); i++) {
                y_str += num_vec.get(i);
            }


            if (x_str.charAt(x_str.length() - 1) == '0' && y_str.charAt(y_str.length() - 1) == '0') {
                continue;
            }

            if (Integer.parseInt(x_str) * Integer.parseInt(y_str) == Integer.parseInt(num_str)) {
                return new Pair<>(x_str, y_str);
            }
        } while (Collections2.nextPermutation(num_vec));

        return new Pair<>("", "");
    }


    static boolean isVampire(int m_int) {


        String n_str = Integer.toString(m_int);


        if (n_str.length() % 2 == 1) {
            return false;
        }


        Pair<String, String> fangs = getFangs(n_str);
        if (fangs.first.isEmpty() && fangs.second.isEmpty()) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 16000;
        for (int test_num = 10; test_num < n; test_num++) {
            if (isVampire(test_num)) {
                System.out.print(test_num + ", ");
            }
        }
    }

    static class Pair<U, V> {
        public final U first;
        public final V second;

        private Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Collections2 {
        static boolean nextPermutation(List<String> list) {
            int i = list.size() - 2;
            while (i >= 0 && list.get(i).compareTo(list.get(i + 1)) >= 0) {
                i--;
            }
            if (i < 0) {
                return false;
            }
            int j = list.size() - 1;
            while (list.get(j).compareTo(list.get(i)) <= 0) {
                j--;
            }
            Collections.swap(list, i, j);
            Collections.reverse(list.subList(i + 1, list.size()));
            return true;
        }
    }
}


