import java.util.Scanner;

/**
 * Created by LAB on 1/24/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> mystack=new ArrayStack<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("Is the stack is empty "+mystack.isEmpty()+"\n");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Input Elements : ");
            mystack.push(in.nextInt());
            System.out.println("Top Element is : "+mystack.top());
            System.out.println("Size= "+mystack.size());
            System.out.println("Is the Stack empty ? "+mystack.isEmpty());
        }

        for (int i = 0; i <5 ; i++)
        {
            System.out.println("Input Elements : ");
            mystack.pop();
            System.out.println("Deleted Element is : "+mystack.pop());
            System.out.println("Top Element is : "+mystack.top());
            System.out.println("Size= "+mystack.size());
            System.out.println("Is the Stack empty ? "+mystack.isEmpty());
        }
    }
}
