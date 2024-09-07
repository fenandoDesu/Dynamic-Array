public class DynamicArray {
    int capacity = 10;
    int size = 0;
    Object[] array;

    DynamicArray(){
        this.array = new Object[capacity];
    }
    DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void delete(int index){
        for(int i = index; i < size; i++){
            array[i] = array[i + 1];
        }
        shrink();
        size--;
    }

    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void insert(Object data, int index){
        if(size >= capacity) grow();
        //System.out.println(size);
        for(int i = size; i > index ; i--){
            array[i] = array[i - 1];

        }
        array[index] = data;
        size++;
    }
    public void grow() {
        int newCapacity = (capacity + 5);
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }
    public void shrink(){
        int newCapacity = (capacity / 3);
        if(capacity <= newCapacity){
            Object[] newArray = new Object[newCapacity];
            for(int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            array = newArray;
            capacity = newCapacity;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        String string = "";
        for(int i = 0; i < size; i++){
            string += array[i];
            string = string + ", ";
        }
        string = string.substring(0, string.length() - 2);
        return string;
    }
}
