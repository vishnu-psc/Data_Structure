package Stack;

public class ReverseString{
    static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node top;

        public static boolean isEmpty() {
            return top == null;
        }

        public static void push(char data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }

        public static char pop() {
            if (isEmpty()) {
                return 'z';
            }
            char e = top.data;
            top = top.next;
            return e;
        }

        public static char peek() {
            if (isEmpty()) {
                System.out.println("z");
                return 'z';
            }
            return top.data;
        }
    }

 
    public static void main(String[] args) {
        Stack s = new Stack();
        String str = "sfhzkdcj";
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String kamal = "";
        while (!s.isEmpty()) {
            
          kamal =  kamal + s.pop();
        }
        System.out.println(kamal);
        // s.peek();
    }
}
