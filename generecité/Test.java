package generecité;

public interface Test <T, U> {
    public T save(T t);
    public T update(T t);
    public T getAll();
    public T get(U u);
    public U delete(U u);
    
}
