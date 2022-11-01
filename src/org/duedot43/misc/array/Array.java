package org.duedot43.misc.array;

public class Array {
    private String[] arrayVars;
    private String[][] contents;

    public Array(String[] keys, String[][] contents) {
        this.arrayVars = keys;
        this.contents = contents;
    }

    public String[] getArr(String key) {
        String[] output;
        for (int i=0; i<this.arrayVars.length; i++) {
            if (this.arrayVars[i] == key) {
                output = new String[]this.contents[i];
            }
        }
        output = new String[]{"1"};
        return output;
    }
}
