
    static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {
        // Write your code here.
        int index = 0, red = -1, blue = balls.size()-1;
        
        while( index <= blue ){
            if(balls.get(index) == 'R'){
                swap(balls, index, ++red);
                
            }
             if(balls.get(index) == 'B'){
                swap(balls, index, blue);
                blue--;
                
            }
            else
                index++;
            
            
        }
        return balls;
    }
    
    static void swap(ArrayList<Character> balls, int index, int index2){
        Character temp = balls.get(index);
        balls.set(index, balls.get(index2) );
        balls.set(index2, temp);
        
    }

