/**
 * Created by winsion on 2017/1/13.
 */
class addreles {

    public int add(int a, int b) {
        return a + b;

    }
}


class arrayType {

    public int[] intiwith(int[] haha) {
        int[] newarray = new int[haha.length];

        for (int i = 0; i < haha.length; i++) {
            newarray[i] = haha[haha.length -1 -i];
        }
        return  newarray;
    }

}