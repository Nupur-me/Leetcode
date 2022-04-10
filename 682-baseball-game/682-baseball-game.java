class Solution {
    public int calPoints(String[] ops) {
         
        Stack<Integer> stack = new Stack<>();
        
        for(String s : ops){
            if(s.equals("C")){
                stack.pop();
            }
            
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            
            else if(s.equals("+")){
                
            
                int temp = stack.pop();
                int sum = temp + stack.peek();
                stack.push(temp);
                stack.push(sum);
            }
            
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        
        int sum = 0;
        for(int i : stack){
          sum += i;  
        }
        
        return sum;
        
    }
}