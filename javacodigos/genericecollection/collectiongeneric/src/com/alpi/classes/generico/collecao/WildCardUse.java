package com.alpi.classes.generico.collecao;

import java.util.List;
import java.util.ArrayList;
class WildCardUse {
static void printList(List<?> list){
for(Object element: list)
System.out.println("[" + element + "]");
}
public static void main(String []args) {
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(100);
printList(list);
List<String> strList = new ArrayList<>();
strList.add("10");
strList.add("100");
printList(strList);
}
}