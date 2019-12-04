package com.alpi.classes.generico.collecao;
import java.util.List;
import java.util.ArrayList;
class Utilities {
public static <T> void fill(List<T> list, T val) {
for(int i = 0; i < list.size(); i++)
list.set(i, val);
}
}
