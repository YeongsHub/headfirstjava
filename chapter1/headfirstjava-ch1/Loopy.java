public class Loopy {
    public static void main (String[] args){
        int x = 1;
        System.out.println("반복문 이전 ");
        while(x <4) {
            System.out.println("반복문 내부");
            System.out.println("x의 값은 " + x + "입니다.");
            x++;
        }
        System.out.println("반복문 외부");
    }
}
