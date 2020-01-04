import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<OfertaSprzedazy> list = new ArrayList<>();

        list.add(new OfertaSprzedazy("o1",1.0));
        list.add(new OfertaSprzedazy("o2",4.0));
        list.add(new OfertaSprzedazy("o3",3.0));

        list.sort(new MyComparer(true));

        list.forEach(item-> System.out.println(item.getNazwaProduktu()));
    }
}
