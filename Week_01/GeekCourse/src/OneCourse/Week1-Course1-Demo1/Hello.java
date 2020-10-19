package OneCourse.Demo1;

public class Hello{
    public static void main(String[] args) {
        String name = "小王";
        double dou = 1.00;
        for (int i=1;i<10;i++){
            if(i==1){
                dou = dou+i;
            }else if(i==4){
                dou = dou-1;
            }else if(i==5){
                dou = dou*i;
            }else if(i==8){
                dou = dou/8;
            }
        }
        System.out.println(dou);
    }
}
