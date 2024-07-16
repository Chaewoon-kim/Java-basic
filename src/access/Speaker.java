package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    //음량 높이는 메서드
    void volumeUp(){
        if(volume>=100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");

        }else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    //음량 내리는 메서드
    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    //음량 확인하는 메서드
    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
