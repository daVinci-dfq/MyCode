package text.Ex6;

import java.util.*;

public class Ex6 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int max = scan.nextInt();
        Date start, end;
        int i, j, index;
        ArrayList aList;
        aList = new ArrayList();
        for(i = 0; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                aList.add(new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();
        aList = new ArrayList();
        for(i = 0; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                aList.add(0, new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();
        aList = new ArrayList();
        for(i = 0 ; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                index = (int)(Math.random() * aList.size());
                aList.add(index, new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();

        MyArrayList list;
        list = new MyArrayList();
        for(i = 0; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                list.append(new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();
        list = new MyArrayList();
        for(i = 0; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                list.insert(0, new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();
        list = new MyArrayList();
        for(i = 0; i < 50; i++) {
            start = new Date();
            for(j = 0; j < max; j++){
                index = (int)(Math.random() * list.size());
                list.insert(index, new Data(Math.random()));
            }
            end = new Date();
            System.out.print((end.getTime() - start.getTime()) + ",");
        }
        System.out.println();
    }
}
