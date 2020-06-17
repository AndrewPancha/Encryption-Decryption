import java.nio.charset.Charset;

class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char)array[i];
    }


    public AsciiCharSequence subSequence(int i, int i1) {
        byte[] arr = new byte[i1 - i];
        System.arraycopy(array, i, arr, 0, i1 - i);
        return new AsciiCharSequence(arr);
    }

    @Override
    public String toString() {
        return new String(array, Charset.forName("Ascii"));
    }
}
