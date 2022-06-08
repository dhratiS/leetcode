
    static Integer kth_largest_in_an_array(ArrayList<Integer> numbers, Integer k) {
        int result = 0;
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        return numbers.get(k-1);
    }
