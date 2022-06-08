
    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        int index = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i)%2 == 0){
                swap(numbers, index, i);
                index++;
            }
            
        }
        return numbers;
    }

    static void swap(ArrayList<Integer> numbers , int index, int i){
        int temp;
        temp = numbers.get(index);
        numbers.set(index, numbers.get(i));
        numbers.set(i, temp);
    } 
