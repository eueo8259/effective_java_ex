package item_9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources {
    private static final int BUFFER_SIZE = 8192;

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine(); // 파일의 첫 번째 줄 읽기
        } // 여기서 br.close() 자동 호출
    }

    static void copy(String src, String dst) throws IOException{
        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)){
            byte [] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0){
                out.write(buf, 0, n);
            }
        }
    }

    static String firstLineOfFileTryCatch(String path, String defaultVal) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e){
            return defaultVal;
        }
    }

}
