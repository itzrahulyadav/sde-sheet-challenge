class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> temp = new ArrayList<>();

            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }
            temp.add(1);
            list.add(temp);
        }

        return list;
    }
}
