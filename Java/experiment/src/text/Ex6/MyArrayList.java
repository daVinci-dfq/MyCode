package text.Ex6;

public class MyArrayList {
    private int len = 4;
    private Data[] arr = new Data[len];

    private int dataNumber = 0;

    public int getDataNumber() {
        return dataNumber;
    }

    public void setDataNumber(int dataNumber) {
        this.dataNumber = dataNumber;
    }

    public Data[] getArr() {
        return arr;
    }

    public void setArr(Data[] arr) {
        this.arr = arr;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void append(Data data) {
        if (dataNumber >= len)
            increaseSize();
        arr[dataNumber] = data;
        dataNumber++;
    }
    public void insert(int index, Data data) {
        if (index < dataNumber && index >= 0) {
            dataNumber++;
            if (dataNumber >= len)
                increaseSize();
            for (int i = dataNumber - 1; i > index; i++) {
                arr[i] = arr[i - 1];
            }
            arr[index] = data;
        }
    }
    public void delete(int index) {
        if (index < dataNumber && index >= 0) {
            for (int i = index; i < dataNumber - 1; i++) {
                arr[i] = arr[i + 1];
            }
            dataNumber--;
        }
    }
    public Data find(int index) {
        if (index < dataNumber && index >= 0) {
            return arr[index];
        }else {
            return null;
        }
    }
    public int size() {
        return dataNumber;
    }
    private void increaseSize() {
        Data[] array = new Data[len * 2];
        for (int i = 0; i < len; i++) {
            array[i] = arr[i];
        }
        len *= 2;
        arr = array;
    }
}
