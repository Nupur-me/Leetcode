class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> ans = new ArrayList<String>(n);
        for(int i = 1, fizz = 0, buzz = 0; i<=n; i++){
            fizz++;
            buzz++;
        if(fizz==3 && buzz == 5){
            ans.add("FizzBuzz");
            fizz = 0;
            buzz = 0;
        }
        else if(fizz == 3){
            fizz = 0;
            ans.add("Fizz");
            
        }
        else if(buzz == 5){
             buzz = 0;
            ans.add("Buzz");
           
        }
        else{
            ans.add(Integer.toString(i));
        }
        }
        return ans;
    }
}