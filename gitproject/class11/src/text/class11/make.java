package text.class11;

public class make {
    public static void main(String[] ages){
        int age=67;
        String mn;
        if(age>60){
            mn="老年";
        }else if(age>40){
            mn="中年";
        }else if(age>18){
            mn="少年";
        }else{
            mn="童年";
        }
        System.out.println(mn);
    }
}
