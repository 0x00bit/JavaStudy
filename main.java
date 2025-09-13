public class main{
    public static void main(String[] args) {
        int average = calculate(5, 10);
        String name = getName();
        String message = "Hello, " + name + " your age is " + getAge() + "! The average is: " + average;
        System.out.println(message);
    }
}

public class getName(){
    return "Steve";
}

public class getAge(){
    return 30;
}

public class calculate(int a, int b){
    return (a + b)/2;
}