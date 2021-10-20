package by.epamtc.HacakConstantine.task03.Task1.Model;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/18/21
 * Time: 8:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Array  {
    private int[] value;

    public Array(int[] value) {
        this.value = new int[value.length];
        System.arraycopy(value, 0, this.value, 0, value.length);
    }

    public Array(String s) throws NumberFormatException {

        // calling replaceAll() method and split() method on
        // string
        String[] string = s.replaceAll("\n\\[", "")
                .replaceAll("]", "")
                .split(",");
        // declaring an array with the size of string
        int[] arr = new int[string.length];

        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.parseInt(string[i]);
        }

        this.value = arr;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = new int[value.length];
        System.arraycopy(value, 0, this.value, 0, value.length);
    }

    @Override
    public String toString() {
        if (this.value == null)
            return "null";
        if (this.value.length == 0)
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(this.value[i]);
            if (i == this.value.length-1)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Array array = (Array) o;
        int length = this.value.length;
        if (array.value.length != length)
            return false;
        for (int i = 0; i < length; i++)
            if (this.value[i] != array.value[i])
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result;
        for (int i : this.value)
            result += i;
        return result;
    }


}
