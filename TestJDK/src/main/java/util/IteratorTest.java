package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Function:
 *
 * @version 1.0
 *          Date: 2016/6/6
 *          Time: 10:43
 * @author: XJ
 */
public class IteratorTest implements Iterator<Integer> {

    private List<Integer> intList = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return intList.iterator().hasNext();
    }

    @Override
    public Integer next() {
        return intList.iterator().next();
    }

    public static void main(String[] args) {
        IteratorTest test = new IteratorTest();
        test.intList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator<Integer> iterator = test.intList.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num == 5) {
                iterator.remove();
                continue;
            }
            System.out.println(num);
        }

    }
}
