package com.e2mg.java.nio;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class ByteBufferTest {

    @Test
    public void testByteBuffer() throws IOException {
        RandomAccessFile fis = new RandomAccessFile(new File("D://a.txt"), "rw");
        FileChannel channel = fis.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = channel.read(byteBuffer);
        int size = 0;
        while (read != -1) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                size++;
                System.out.println(byteBuffer.get());
            }
            byteBuffer.compact();
            read = channel.read(byteBuffer);
        }
        System.out.println(size);
    }
}
