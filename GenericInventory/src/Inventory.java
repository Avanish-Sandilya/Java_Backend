import java.util.ArrayList;
import java.util.List;

public class  Inventory <T> {

    private final List<T> items;
    public Inventory(){
        this.items = new ArrayList<>();
    }

    public Inventory(List<T> items) {
        this.items = new ArrayList<>(items);
    }

    public void addItem(T t){
        if(t!=null){
            items.add(t);
        }
    }

    public void printItems(){
        for(var v:items){
            System.out.println(v);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
