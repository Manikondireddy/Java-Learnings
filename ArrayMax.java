package Cool;
public class ArrayMax {

    int[] ints = {0,2,4,6,8,10};

int minVal = Integer.MAX_VALUE ;

for(int i=0; i < ints.length; i++){
    if(ints[i] < minVal){
        minVal = ints[i];
    }
}

System.out.println("minVal = " + minVal);
    

 
