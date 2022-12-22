package ru.avtf.rgz_chernyavsky.comparator;

import java.io.Serializable;

import ru.avtf.rgz_chernyavsky.types.DoubleType;

public class DoubleComparator implements Comparator, Serializable {
    @Override
    public double compare(Object o1, Object o2) {
        return ((DoubleType)o1).getDoubleTypeValue() - ((DoubleType)o2).getDoubleTypeValue();
    }
}
