package mx.com.ravisa.ecommerce.templateengine.repository;

import java.io.Serializable;
import java.util.List;

public interface ExtendedRepository<T,ID extends Serializable> {
    public List<T> findByAttributeContainsText(String attributeName, String text);
    public T updateWith(T with, ID id);

}