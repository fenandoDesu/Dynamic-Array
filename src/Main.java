public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("initial size: " + dynamicArray.size);
        System.out.println("initial capacity: " + dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        dynamicArray.add("K");
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

        System.out.println(dynamicArray);
        dynamicArray.insert("O", 5);
        System.out.println(dynamicArray);
        dynamicArray.delete(5);
        System.out.println(dynamicArray);

        

    }
}


