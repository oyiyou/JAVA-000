package OneCourse.Demo2;

import java.io.*;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class HelloClassLoader extends ClassLoader {

    public HelloClassLoader(){}
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class cls;
        byte[] bytes = getData("Hello.xlass");
        cls = defineClass(name,bytes,0,bytes.length);
        return cls;
    }

    private byte[] getData(String filename) {
        File file = new File(this.getClass().getResource("").getPath()+"/"+filename);
        if(file.exists()){
            FileInputStream fs = null;
            FileOutputStream fo = null;
            try {
                fs = new FileInputStream(file);
                fo = new FileOutputStream(this.getClass().getResource("").getPath()+"Hello.class");
                int num = fs.available();
                byte[] bytes = new byte[num];
                int size = fs.read(bytes);
                for (int i = 0; i < bytes.length ; i++) {
                    bytes[i] = (byte) (255-bytes[i]);
                }
                fo.write(bytes,0 ,bytes.length);
                return bytes;
            } catch (Exception e) {
                throw new RuntimeException("class not found");
            }finally{
                try {
                    fs.close();
                    fo.close();
                } catch (IOException e) {
                    throw new RuntimeException("IO Exception");
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HelloClassLoader classloader = new HelloClassLoader();
        try {
            Class cls = classloader.loadClass("Hello");
            Method method = cls.getDeclaredMethod("hello");
            method.invoke(cls.newInstance());
        } catch (Exception e) {
           throw new RuntimeException("checking you code!");
        }
    }
}
