package com.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsVsCollections {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("srinu");
        arrayList.add("Code");

        System.out.println(arrayList.stream().count());
    }
}
