 class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, dir = 0;
    //N = 0, E = 1, S = 2, W = 3    
        
        for(char i : instructions.toCharArray()){
            if(i == 'G'){         
                switch (dir){
                case 0: y++; 
                        break;
                case 1: x++; 
                        break;
                case 2: y--; 
                        break;
                case 3: x--; 
                        break;
                } 
            }
            else if(i == 'L'){
                dir = dir == 0 ? 3 : (dir-1);
            }
            else if(i == 'R'){
                dir = (dir + 1)%4;
            }
        }
        if(dir != 0 || (x == 0 && y == 0)){
            return true;
        }
        return false;
    }
}