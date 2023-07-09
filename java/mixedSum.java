import java.util.List;

public class MixedSum {

    public int sum(List<?> mixed) {	
        int result = 0;
        for (int i = 0; i < mixed.size(); i++) {
            Object element = mixed.get(i);
            if (element instanceof Integer)
                result += (Integer) element;
            else 
                result += Integer.parseInt((String) element);         
        }
        return result;
    }
}

