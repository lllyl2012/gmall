package top.lllyl2012.gmall;


import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

//@SpringBootTest
public class FastdfsTest {

//    @Test
public static void main(String[] args) throws IOException, MyException {
        String fileName = FastdfsTest.class.getResource("/tracker.conf").getFile();

        ClientGlobal.init(fileName);

        TrackerClient trackerClient = new TrackerClient();

        TrackerServer trackerServer = trackerClient.getConnection();


//    StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);

        StorageClient storageClient = new StorageClient(trackerServer, null);

        String[] uploadInfos = storageClient.upload_file("E:\\image\\10.png", "png", null);

        for (String a:
             uploadInfos) {
            System.out.println(a);
        }
    }

}
