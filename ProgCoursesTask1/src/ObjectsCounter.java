import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by TVykhor on 29.03.2017.
 */
public class ObjectsCounter {
    private static int objectsCounter = 0;
    ObjectsCounter(){
        objectsCounter++;
    }
    public static void main(String [] args){
        ObjectsCounter o1 = new ObjectsCounter();
        ObjectsCounter o2 = new ObjectsCounter();
        System.out.println(objectsCounter);
    }
}
