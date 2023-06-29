package java21.com.jse17.switch_case_expression;

public class SwitchDemo {
    enum Type{
        A,
        B,
        C;
    }

    public static void main(String[] args) {
        Type type = Type.C;
        var x = switch (type)
        {
            case A -> "x";
            case B -> "y";
            case C -> "z";
            default -> "bcs";
        };
    }
}
