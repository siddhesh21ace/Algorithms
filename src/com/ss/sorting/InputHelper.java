package com.ss.sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siddhesh on 3/5/2017.
 */
class InputHelper {
    private static final int INT = 1;
    private static final int DOUBLE = 2;

    private static List<Object> input = new ArrayList<>();

    private static void readInts(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            input.add(Integer.parseInt(line.trim()));
        }
    }

    private static void readDoubles(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            input.add(Double.parseDouble(line.trim()));
        }
    }

    private static void readStrings(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            input.add(line.trim());
        }
    }

    static Object[] readFile(int inputType) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            switch (inputType) {
                case INT: {
                    readInts(br);
                    break;
                }
                case DOUBLE: {
                    readDoubles(br);
                    break;
                }
                default: {
                    readStrings(br);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Object a[] = new Object[input.size()];
        return input.toArray(a);
    }
}
