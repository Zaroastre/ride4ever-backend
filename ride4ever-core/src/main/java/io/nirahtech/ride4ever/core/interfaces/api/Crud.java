package io.nirahtech.ride4ever.core.interfaces.api;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface Crud<T> {

    /**
     * 
     * @param entity
     */
    public T create(T entity);
    
    /**
     * 
     * @param identifier
     * @return
     */
    public T read(Long identifier);
    
    /**
     * 
     * @param entity
     */
    public T update(Long identifier, T entity);
    
    /**
     * 
     * @param identifier
     */
    public void delete(Long identifier);
}
