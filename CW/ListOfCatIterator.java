package Seminar3.CW;
import java.util.Iterator;
import java.util.List;
public class ListOfCatIterator implements Iterator<Cat>{
    private List<Cat> catListIteartor;
    private int counter;
    public ListOfCatIterator(List<Cat> catList){
        catListIteartor = catList;
        counter = 0;

    }
    @Override
    public boolean hasNext() {
        return counter < catListIteartor.size();
    }

    @Override
    public Cat next() {
        if (!hasNext()){
            return null;
        }
        else {
            return catListIteartor.get(counter++);
        }
    }
}
