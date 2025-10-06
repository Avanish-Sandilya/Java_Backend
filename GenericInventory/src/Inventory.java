import java.util.List;

public class  Inventory <T> {

    private List<T> items;

    public Inventory(List<T> items) {
        this.items = items;
    }

    public String addItem(T t){
        if(t!=null){
            items.add(t);
            return "Item successfully added";
        }
        return "cannot add null";
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
