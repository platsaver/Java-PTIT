import java.util.*; 

public class rut_gon_xau_ky_tu{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        String s = object.nextLine(); 
        Stack<Character> stack = new Stack<>(); 
        for (int i=0; i<s.length(); i++){
            if (stack.empty()){
                stack.push(s.charAt(i)); 
            }
            else{
                if (stack.lastElement()==s.charAt(i)){
                    stack.pop(); 
                }
                else{
                    stack.push(s.charAt(i)); 
                }
            }
        }
        if (stack.empty()){
            System.out.println("Empty String"); 
        }
        else{
            for (int c=0; c<stack.size(); c++){
                System.out.print(stack.get(c)); 
            }
        }
        object.close(); 
    }
}