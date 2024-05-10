package generic.test.ex2;

public class Pair<T1, T2> {

    private T1 first;
    public T2 second;


    public void setFirst(T1 key){
        this.first =key;
    }

    public void setSecond(T2 value){
        this.second =value;
    }

    public T1 getFirst(){
        return first;
    }

    public T2 getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

