package com.alpi.classes.enumtipodados;

public enum PrinterType {
DOTMATRIX(5), LASER(50), INKJET(10);

private int pagePrintCapacity;
private PrinterType(int pagePrintCapacity) {
this.pagePrintCapacity = pagePrintCapacity;
}
public int getPrintPageCapacity() {
return pagePrintCapacity;
}
}

