package general;

//public final class Immutable
public final class Immutable {

    private final String[] array;

    public Immutable(String[] arr){
        this.array = arr.clone(); 

    }
 

    public String toString() {

        StringBuffer sb = new StringBuffer("Characters in array are: ");

        for (int i = 0; i < array.length; i++) {

            sb.append(array[i] + " ");

        }

        return sb.toString();

    }

 

    public static void main(String[] args) {

        String[] array = {"a","b"};

        Immutable immutableClass = new Immutable(array) ;

        System.out.println("Before constructing " + immutableClass);

        array[1] = "c"; // change (i.e. mutate) the element

        System.out.println("After constructing " + immutableClass);

    }

}
