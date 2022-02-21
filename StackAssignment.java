public class StackAssignment {
    public static void transfer(ArrayStack S,ArrayStack T)
    {
        for (int i = S.size(); i>0; i--)
        {
            T.push(S.pop());
        }
    }
    public static void delete(ArrayStack S)
    {
        for (int i =S.size() ; i >0; i--)
        {
            S.pop();
        }
    }

    public static int calculate(String exp)
    {
        ArrayStack <Integer>expression=new ArrayStack<>(exp.length());
        for (int i = 0; i <exp.length() ; i++)
        {
            int ch=exp.charAt(i);
            if (ch=='+'||ch=='-'||ch=='/'||ch=='*') {
              int  operand2 = expression.pop();
              int operand1 = expression.pop();
                switch (ch) {
                    case ('-'): expression.push(operand1 - operand2);
                    break;

                    case '+': expression.push(operand1 + operand2);
                    break;

                    case '/': expression.push(operand1 / operand2);
                    break;

                    case '*': expression.push(operand1 * operand2);
                    break;
                }
            }
            else expression.push((int) exp.charAt(i)-'0');
        }

        return expression.pop();
    }

    public static void main(String[] args) {
        ArrayStack<Integer>stack1=new ArrayStack<>(5);
        ArrayStack<Integer>stack2=new ArrayStack<>(5);
        for (int i = 0; i < 5; i++)
        {
            stack1.push(i);
        }
        transfer(stack1,stack2);
        System.out.println("Size of stack1 after transfer is : "+stack1.size());
        System.out.println("Size of stack2 after transfer is : "+stack2.size());
        System.out.println("The size before deleting : "+stack2.size());
        delete(stack2);
        System.out.println("The Size after deleting : "+stack2.size());
        System.out.println(calculate("32-4*"));
    }
}
