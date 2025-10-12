//. raha toh ignore
//.. raha toh pop
// multiple slashes ignore
//join karna hai sabko / sey
class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("\\/+");

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < dir.length; i++){
            if(dir[i].equals("..")){
                if(!stack.isEmpty()){
                   stack.pop(); 
                }
            }else{
                if(!dir[i].isEmpty() && !dir[i].equals(".")){
                    stack.push(dir[i]);
                }
            }
        }

        if(stack.isEmpty()){
            return "/";
        }

        return "/" + String.join("/", stack);
    }
}