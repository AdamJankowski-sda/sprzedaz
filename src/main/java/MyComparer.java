import java.util.Comparator;

public class MyComparer implements Comparator<OfertaSprzedazy> {

    private boolean descendinOrder;
    public MyComparer(boolean descendinOrder)
    {
        this.descendinOrder = descendinOrder;
    }
    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        int compareResult = Double.compare(o1.getCena(),o2.getCena());

        if(descendinOrder == true)
        {
            return Double.compare(o1.getCena(),o2.getCena());
        }
        else{
            return Double.compare(o2.getCena(),o1.getCena());
        }

    }
}
