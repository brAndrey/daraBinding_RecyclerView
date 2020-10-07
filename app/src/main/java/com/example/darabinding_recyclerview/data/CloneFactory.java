package com.example.darabinding_recyclerview.data;

import java.util.ArrayList;
import java.util.List;

public class CloneFactory {
    private static CloneFactory sCloneFactory;
    private static List<Clone> mPersonList;

    public static List<Clone> getCloneList() {
        if(sCloneFactory == null){
            sCloneFactory = new CloneFactory(15);
        }
        return mPersonList;
    }

    private CloneFactory(int limit) {
        limit=100;
        mPersonList = new ArrayList<>(limit);
        for (int i = 0; i < limit; i++) {
            if(i % 2 == 0){
                mPersonList.add(new Clone(i,"Иванов Иван клон#"+i, 25, " Москва ", true));
            }else{
                mPersonList.add(new Clone(i,"Петрова Мария клон#"+i, 33, " Санкт-Петербург ", false));
            }
        }

    }
}
