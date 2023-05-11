package java21.com.advanced.ch20_nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class NIOSummary {
    public static void main(String[] args) throws IOException {
        Path path111 = FileSystems.getDefault().getPath("\\a\\..\\text.txt");
        System.out.println(path111.toAbsolutePath());
    }
}
