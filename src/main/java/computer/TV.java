package computer;

public class TV implements HDMI{
    @Override
    public void view(byte[] bytes) {
        System.out.println("+++++++++TV+++++++");
        String data=new String(bytes);
        System.out.println(data);
        System.out.println("+++++++++TV++++++");
    }

}
