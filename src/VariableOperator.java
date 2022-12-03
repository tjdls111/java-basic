public class VariableOperator {
    public static void main(String[] args) {
        int age;
        age = 10;
        age ++;
        System.out.println(age);

        int intNumber;
//        intNumber = 1.1; (X)
        intNumber = (int) 1.1;

        System.out.println(1+1.1);
        System.out.println(10 /3.0);
        System.out.println(10 / 3);
    }
}
