package bjsxt;

import java.util.Comparator;


class  OrderBySex implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSex().compareTo(o2.getSex());
    }
}

