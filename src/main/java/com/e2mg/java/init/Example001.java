package com.e2mg.java.init;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example001 extends Example01 {
    private int a = getAA(0);
    private static Example001 example001 = new Example001();
    private static int random = (int) (Math.random() * 100);

    public Example001() {
        System.out.println("Example001");
        a = random - 10;
    }

    public static void main(String[] args) throws MalformedURLException {
        URI uri = URI.create("file://./a");
        System.out.println(Paths.get(uri).getFileName());
        System.out.println(uri.getPath());
//        URL url = new URL("a");
//        System.out.println(url.getFile());
        System.out.println(example001.a);
    }

    private int getAA(int param) {
        System.out.println("getAA " + param);
        return 10;
    }
}
