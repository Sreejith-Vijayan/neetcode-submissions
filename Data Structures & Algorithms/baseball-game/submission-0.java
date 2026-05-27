class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = stack.pop();
                int res = top + stack.peek();
                stack.push(top);
                stack.push(res);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                int top = stack.pop();
                int res = top * 2;
                stack.push(top);
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int i : stack){
            sum += i;
        }
        return sum;
    }
}