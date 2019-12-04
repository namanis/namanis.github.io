package com.alpi.classes.generico.collecao;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class RawTest1 {
public static void main(String []args) {
List list = new LinkedList();
list.add("First");
list.add("Second");
List<String> strList = list; //#1
for(Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
System.out.println("Item: " + itemItr.next());

List<String> strList2 = new LinkedList<>();
strList2.add("First");
strList2.add("Second");
List list2 = strList2; //#2
for(Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
System.out.println("Item: " + itemItr.next());
}
}