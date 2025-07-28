package Cool.Operations.Switchstatements.Javainstanceoperator;

import java.util.HashMap;
import java.util.Map;

public class Instanceof {
public static void main(String[] args) {
        Map<Object, Object> map = new HashMap();

        boolean mapIsObject = map instanceof Object;

        System.out.println(mapIsObject);
    }
}
    

