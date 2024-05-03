package hybernate.dao;

public interface CustomDao<T,ID> {
    String save(T type);
    T findById()
}
