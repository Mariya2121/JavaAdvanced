package GenericsExcercise;

import java.util.ArrayList;
import java.util.List;

public class Box2 {
    private List<Integer> values;

    public Box2(){
        this.values = new ArrayList<>();
    }

    public void add(int element){
        this.values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer value : values) {
            stringBuilder.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return stringBuilder.toString();
    }

}
