class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        Stack<Integer> stack = new Stack();
        boolean isLastOneBit = true; 
        a:
        for(int b:bits){
            while(!stack.empty() && (stack.peek() == 1)){
                stack.pop();
                isLastOneBit = false;
                continue a;
                
            }
            stack.push(b);
            isLastOneBit = true;
        }
        if(isLastOneBit){
            return true;
        }
        return false;
    } 
}