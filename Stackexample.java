import java.util.Scanner;
import java.util.Stack;
public class Stackexample {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length - 1]);{
            for(int i = arr.length - 2; i >= 0; i--){
                if(arr[i] < stack.peek()){
                    stack.push(arr[i]);
                }
            }
while(!stack.isEmpty()){
            System.out.println(stack.pop()+"");
        }
        }}}

