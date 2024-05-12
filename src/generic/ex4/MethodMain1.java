package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i =10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>genericMethod(10);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.genericMethod(10);
        Double doubleValue2 = GenericMethod.genericMethod(20.0);

    }
}
