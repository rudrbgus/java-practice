package file;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class RootPath {
    public static String rootPath;

    public static String userName;

    static{
        userName=System.getProperty("user.name");
        loadRootPath();

    }

    public static void loadRootPath(){
        String docRS = "C:\\Users\\"+userName+"\\Documents\\RomanticSimulator";
        File file = new File(docRS);
        File file2 = new File(docRS + "\\PathInfo.txt");
        if(!file.exists()){ // 폴더가 없을 경우
            System.out.println("폴더 생성");
            file.mkdir();
            try {
                System.out.println("파일 생성");
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if(!file2.exists()){ // 파일이 없을 경우
            try {
                System.out.println("파일 생성");
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else { // 파일, 폴더 2개 있을 경우
            try(FileReader fileReader = new FileReader(file2)){
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String s = bufferedReader.readLine();
                rootPath = s;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }




//    public static void saveRootPath(){
//        try(FileInput fileInput = new FileInput(rootPath)){
//
//        } catch (){
//
//        }
//    }



}
