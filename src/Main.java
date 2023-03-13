public class Main {
    public static void main(String[] args) {
        String[] arr = {"S", "k", "y", "P", "k", "S", "r", "k", "y", "o", "S" };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == null) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = null;
                }
            }
        }
        String out = "";
        for (String element : arr) {
            if (element != null) {
                out += element;
            }
        }
        System.out.println(out);
    }
}