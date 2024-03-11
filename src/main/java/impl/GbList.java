package impl;

public interface GbList<T>{
    void addLastElement(T e);
    void addFirstElement(T e);
    T getElemByIndex(int index);
    int size();
}
