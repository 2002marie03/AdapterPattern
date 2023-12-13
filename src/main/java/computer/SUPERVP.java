package computer;

public class SUPERVP implements HDMI,VGA{
    @Override
    public void view(byte[] bytes) {
        System.out.println("=====Video Projecteur HDMI=======");
        String data=new String(bytes);
        System.out.println(data);
        System.out.println("=====Video Projecteur HDMI =======");
    }

    @Override
    public void print(String message) {
        System.out.println("=====Video Projecteur VGA=======");
        System.out.println(message);
        System.out.println("=====Video Projecteur VGA=======");

    }
}
