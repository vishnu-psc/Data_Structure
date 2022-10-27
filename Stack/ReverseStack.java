package Stack;

import java.util.Stack;

public class ReverseStack 
{
    public static void pushAtBottom(int data, Stack<Integer> s) 
    {
        if (s.isEmpty()) 
        {
            s.push(data);
            return;
        }
        int e = s.pop();
        pushAtBottom(data, s);
        s.push(e);
    }

    public static void reverse(Stack<Integer> s) 
    {
        if (s.isEmpty()) 
        {
            return;
        }
        int e = s.pop();
        reverse(s);
        pushAtBottom(e, s);
    }


    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);

        while(!s.isEmpty()) 
        {
        	System.out.println(s.pop());
        }
    }
}
