package collections;

/**
 *
 */
public class TestMyList {
    public static void main(String[] args) {
//        MyList<Integer> list = new MyArrayList<Integer>(100);
        MyList<Integer> list = newMyList();

        MyList<String> stringMyList = newMyList();

        list.add(1);
        list.add(2);
        list.add(3);
        MyArrayList<String> stringMyArrayList = TestMyList.newMyList();

        System.out.println(list.size());

        System.out.println(list.get(50));

    }

    public static <T> MyArrayList<T> newMyList() {
        return new MyArrayList<T>();
    }
}
