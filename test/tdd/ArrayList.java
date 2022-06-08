package tdd;
 // Java program to demonstrate the
// working of ArrayList in Java

class ArrayList<I extends Number> {
    public ArrayList(I n) {

    }

    public static void main(String[] args) {
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli
                = new ArrayList<>(n);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
    }

    private I size() {
        return null;
    }

    private Boolean get(I i) {
        return null;
    }

    private void remove(I i) {
    }

    private void add(I i) {
    }
}

