import java.util.Arrays;

/**
 * Created by LAB on 1/24/2022.
 */
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        ArrayStack<Integer> s=new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++)
        {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++)
        {
            a[i]=s.pop();
        }
        System.out.println("After reverse using stack ");
        System.out.println(Arrays.toString(a));
    }
}
