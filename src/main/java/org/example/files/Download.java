package org.example.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download {

    public static void downloadUsingNIO(String urlStr) throws IOException {

        String[] splits = urlStr.split("/");

        String file = splits[splits.length-1];

        URL url = new URL(urlStr);

        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();

    }

}
