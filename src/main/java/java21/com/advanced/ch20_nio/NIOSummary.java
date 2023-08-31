package java21.com.advanced.ch20_nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class NIOSummary {
    public static void main(String[] args) {
        Path path111 = FileSystems.getDefault().getPath("","text.txt");
        System.out.println(path111);
        System.out.println(path111.toAbsolutePath());
        System.out.println(path111.toAbsolutePath().isAbsolute());
    }
}
