package com.nile.DemoCollection;

import java.util.ArrayList;
import java.util.List;

public class SortDemo {
    public List<Integer> sort(List<Integer> list){
        if(list.size() == 0 || list.size() == 1){
            return list;
        }else{
            List<Integer> newList = new ArrayList<>(list);
            for (int i = 0 ; i < newList.size() ; i++){
                for (int j = i+1 ; j < newList.size() ; j++){
                    int temp = 0;
                    if(newList.get(i) > newList.get(j)){
                        temp = newList.get(i);
                        newList.set(i ,newList.get(j) );
                        newList.set(j , temp);
                    }
                }
            }
            return newList;
        }

    }
}
