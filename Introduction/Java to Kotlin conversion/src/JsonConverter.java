import java.util.Collection;
import java.util.Iterator;

public class JsonConverter {
    public String toJson(Collection<Integer> collection) {
        String json = "{";
        Iterator iterator = collection.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            json += "{\"" + i + "\":\"" + iterator.next() + "\"}";
        }
        return json;
    }
}