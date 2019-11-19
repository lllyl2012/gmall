package top.lllyl2012.gmall;


import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import java.io.IOException;

//@SpringBootTest
public class FastdfsTest {

//    @Test
public static void main(String[] args) throws IOException, MyException {
        String fileName = FastdfsTest.class.getResource("/tracker.conf").getFile();

        ClientGlobal.init(fileName);

        TrackerClient trackerClient = new TrackerClient();

        TrackerServer trackerServer = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(trackerServer, null);

        String[] uploadInfos = storageClient.upload_file("E:\\image\\10.png", "png", null);

        for (String a:
             uploadInfos) {
            System.out.println(a);
        }
    }

}
