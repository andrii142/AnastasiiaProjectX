package datastructures;

public class MapWrapper<T, V> {
    //private String key;
    private T key;
    private V value;

    public MapWrapper(T key, V value) {
        this.key = key;
        this.value = value;
    }

  /*  boolean checkType(T t, V v) {
        //todo
        if(t instanceof V)
            return true;

        return false;
    }*/

    int checkValue(T t) {
        if (value instanceof Integer && (Integer) value > 100)
            return (Integer) value;

        if (t instanceof String)
            return ((String) t).length();

        return -1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MapWrapper{");
        sb.append("key='").append(key).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
