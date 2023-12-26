package text.Ex8;

public class Ex8 {
    public static void main(String[] args) {
        String[] msgs1 = {"java", "web", "compute", "database", "network"};
        String[] msgs2 = {"java1", "web1", "compute1", "database1", "network1"};
        int i;
        MagazineList list1 = new MagazineList();
        for (i = 0; i < msgs1.length; i++)
            list1.add(new Magazine(msgs1[i]));
        list1.sort();
        System.out.println("list1:" + list1.isSort());
        MagazineList list2 = new MagazineList();
        for (i = 0; i < msgs2.length; i++)
            list2.add(new Magazine(msgs2[i]));
        list2.sort();
        System.out.println("list2:" + list2.isSort());
        list1.mergeSort(list2);
        System.out.print(list1.toString());
    }
}
