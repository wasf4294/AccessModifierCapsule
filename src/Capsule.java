public class Capsule {

    /*접근 제어자를 이용한 캡슐화*/

    /*접근 제어자를 잘 사용한다면?
    * 메서드를 하나 수정을 해야할 때 메서드의 접근 제어자가 default 이다.
    * 그러면 메서드를 수정하고 확인하는 범위가 패키지이다.
    * 메서드 접근 제어자가 public 이면, 확인하는 범위의 제한이 없다.
    * 메서드 접근 제어자가 private 이면, 한 클래스만 확인하면 된다.
    * 메서드 접근 제어자가 protected이면, 패키지와 자손 클래스까지 확인을 해야한다.*/



}
/* class Time{
    *//*------------------예시 코드----------------------*//*
    public int hour;
    public int minute;
    public int second;

    public static void main(String[] args) {

        Time t1 = new Time();
        t1.hour = 25;           //이는 말이 안된다. 하지만 통제할 수 없다.
        //시간과 분과 초는 인스턴스를 통제할 만한 유효한 메서드가 필요하다.
    }
}*/

 class Time{
/*

        public 은 제한이 없다. 다른 클래스에서 이를 함부러 호출하지 못하도록 하고
        또한 이를 통제할 메서드를 만든다.
        즉 메서드를 통해서 관리한다.
    public int hour;
    public int minute;
    public int second;*/

    private int hour;
    private int minute;
    private int second;
    /*이렇게 private로 접근 제어자를 변경하면 외부 클래스에서 접근할 수 없다.*/


        /*hour의 유효 범위를 지정한 메서드 */
    public void setHour(int hour){
        if (hour < 0 || hour > 23) return ;
        this.hour = hour;
    }
     public int getHour(){return hour;}

     /*minute의 유효 범위를 지정한 메서드 */
     public void setMinute(int minute){
        if (minute < 0 || minute > 59){
            return;
        }
        this.minute = minute;
     }
     public int getMinute(){
        return minute;
     }

     /*second의 유효 범위를 지정한 메서드 */
     public void setSecond(int second){
         if (second < 0 || second > 59){
             return;
         }
         this.second = second;
     }
     public int getSecond(){
         return second;
     }
}
class NewTime{
    public static void main(String[] args) {
        Time t1 = new Time();

/*
        이제 접근이 불가능하다.
        t1.second = 5;
        t1.minute = 5;
        t1.hour = 5;*/

        t1.setHour(5);
        System.out.println(t1.getHour());
    }
}

