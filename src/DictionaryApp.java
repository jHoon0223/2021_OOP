abstract class PairMap {
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap {
    int i = 0;
    Dictionary(int a) {
        keyArray = new String[a];
        valueArray = new String[a];
    }
    String get(String key) {
        for (int j = 0; j < keyArray.length; j++) {
            if (key.equals(keyArray[j]))
                return valueArray[j];
        }
        return null;
    }
    void put(String key, String value) {
        for (int j = 0; j < keyArray.length; j++) {
            if (key.equals(keyArray[j])) {
                this.valueArray[j] = value;
                break;
            }
        }
        this.keyArray[i] = key;
        this.valueArray[i] = value;
        i++;
    }
    String delete(String key) {
        i--;
        for (int j = 0; j < keyArray.length; j++) {
            if (key.equals(keyArray[j])) {
                this.keyArray[j] = null;
                this.valueArray[j] = null;
                return valueArray[j];
            }
        }
        return null;
    }
    int length() { return i; }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
