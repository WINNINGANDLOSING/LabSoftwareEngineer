// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
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
    
    public static boolean check(int a)
    {
        return (a % 2 == 0);
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(cal(a, b, "*"));
        System.out.println(check(a));
        

    }
}