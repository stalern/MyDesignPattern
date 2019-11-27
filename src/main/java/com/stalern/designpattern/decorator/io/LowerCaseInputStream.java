package com.stalern.designpattern.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 基于Java i/o的装饰者
 * @author stalern
 * @date 2019/11/13~19:58
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int i = super.read();
        return i == -1 ? i : Character.toLowerCase((char)i);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int i = super.read(b, off, len);
        for (int j = off; j < off + i; j++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return i;
    }
}
