package generics.task1;

class Box <T>{
    private T obj;

    public Box(T obj){
        this.obj = obj;
    }

    public void setObj(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    public String toString(){
        return "Box{" +
        "obj = " + obj +
        "; onjType=" + obj.getClass().getName() +
        '}';
    }
}
