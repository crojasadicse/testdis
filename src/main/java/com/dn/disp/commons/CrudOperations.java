package com.dn.disp.commons;

public interface CrudOperations<T, ID> {

    public  T create(T entity);

    public T update(T entity);

    public void delete(ID id);

    public T get(ID id);    

}
