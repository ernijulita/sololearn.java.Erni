package exception.lists.threads.files;

public class sortingLists {
    List<String> list = new ArrayList<String>();

    list.add("b");
    list.add("a");
    list.add("c");
    Collections.sort(list);

    System.out.println(list.get(0));

}
