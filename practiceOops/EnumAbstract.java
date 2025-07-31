package practiceOops;

public class EnumAbstract {
    enum Operation {
        ADD {
            public int apply(int x, int y) {
                return x + y;
            }
        },
        SUBTRACT {
             public int apply(int x, int y) {
                return x - y;
            }
        },
        MULTIPLY {
            public int apply(int x, int y) {
                return x * y;
            }
        },
        DIVIDE { 
            public int apply(int x, int y) {
                return y != 0 ? x / y : 0;
            }
        };
        public abstract int apply(int x, int y);
    }

    public static void main(String[] args) {
        int a = 10, b = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op.name() + " of " + a + " and " + b + " = " + op.apply(a, b));
        }
    }
}
    

