public class Leetcode341 {
/*    private List<NestedInteger> nestedList;
    private List<Integer> flattenedList;
    private int currentIndex = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.flattenedList = new ArrayList<>();
        this.flatten(nestedList);
    }
    @Override
    public Integer next() {
        int number = this.flattenedList.get(currentIndex);
        currentIndex++;
        return number;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < flattenedList.size();
    }
    private void flatten(List<NestedInteger> currentList) {
        for (int i = 0; i < currentList.size(); i++) {
            if (currentList.get(i).isInteger()) {
                flattenedList.add(currentList.get(i).getInteger());
            } else {
                flatten(currentList.get(i).getList());
            }
        }
    }*/
}
