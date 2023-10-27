import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Leetcode5 {
    class RandomizedSet {
        private final List<Integer> list;
        private final Map<Integer, Integer> map;
        private final Random random;

        public RandomizedSet() {
            this.list = new ArrayList<>();
            this.map = new HashMap<>();
            this.random = new Random();
        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                map.put(val, list.size());
                return list.add(val);
            }
            return false;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            if (list.size() > 1) {
                swap(list.get(list.size() - 1), val, list, map);
            }
            if (!list.isEmpty() && list.get(list.size() - 1) == val) {
                list.remove(list.size() - 1);
                return map.remove(val) != null;
            }
            return false;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }

        private void swap(int val1, int val2, List<Integer> list, Map<Integer, Integer> map) {
            var index1 = map.get(val1);
            var index2 = map.get(val2);
            var temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
            map.put(val1, index2);
            map.put(val2, index1);
        }
}
}
