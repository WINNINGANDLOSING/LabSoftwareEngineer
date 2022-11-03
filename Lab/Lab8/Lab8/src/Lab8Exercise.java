public class Lab8Exericse {
    public static int cal(int a, int b, String operator)
    {
        if(operator == "+")
        {
            return a + b;
        }
        else if(operator == "-")
        {
            return a - b;
        }
        else if(operator == "*")
        {
            return a*b;
        }
        else
        {
            return a/b;
        }
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(cal(a, b, "*"));
    }
}