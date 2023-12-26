package text.Ex8;

public class MagazineList {
    private MagazineNode list;

    public MagazineList()
    {
        list = null;
    }

    public void add(Magazine mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    public void delete(MagazineNode mag) {
        if (list.equals(mag))
            list = list.next;
        else {
            MagazineNode current = list;
            while (!current.next.equals(mag))
                current = current.next;
            current.next = mag.next;
        }
    }

    public void insert(MagazineNode a, MagazineNode b) {
        b.next = a.next;
        a.next = b.next;
    }

    public void sort() {
        MagazineList sortedList = new MagazineList();
        while (list != null) {
            MagazineNode current = list;
            MagazineNode min = list;
            while (current.next != null) {
                if (current.magazine.toString().compareTo(min.magazine.toString()) < 0)
                    min = current;
                current = current.next;
            }
            if (current.magazine.toString().compareTo(min.magazine.toString()) < 0)
                min = current;
            sortedList.add(min.magazine);
            this.delete(min);
        }
        list = sortedList.list;
    }

    public void mergeSort(MagazineList another) {
        if (this.isSort() && another.isSort()) {
            MagazineList sortedList = new MagazineList();
            MagazineNode point1 = this.list;
            MagazineNode point2 = another.list;
            while (point1 != null && point2 != null) {
                if (point1.magazine.toString().compareTo(point2.magazine.toString()) < 0) {
                    sortedList.add(point1.magazine);
                    point1 = point1.next;
                } else {
                    sortedList.add(point2.magazine);
                    point2 = point2.next;
                }
            }
            if (point1 == null)
                sortedList.add(point2.magazine);
            else
                sortedList.add(point1.magazine);
            this.list = sortedList.list;
        }
    }

    public boolean isSort() {
        MagazineNode current = list;
        if (current == null || current.next == null)
            return true;
        while (current.next != null) {
            if (current.magazine.toString().compareTo(current.next.magazine.toString()) > 0)
                return false;
            current = current.next;
        }
        return true;
    }

    public String toString()
    {
        String result = "";

        MagazineNode current = list;

        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    private class MagazineNode
    {
        public Magazine magazine;
        public MagazineNode next;

        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }
}
