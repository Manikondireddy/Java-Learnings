package Cool.Operations.Switchstatements;

public class Multiswitchcases {
    public static void main(String[] args) {
        int value = 4;

        String result = switch (value) {
            case 1, 2, 3,7 -> "Value is 1, 2, or 3";
            case 4, 5,6,8,9 -> "Value is 4 or 5";
            default -> "Value is something else";
        };

        System.out.println(result);
    }
}
