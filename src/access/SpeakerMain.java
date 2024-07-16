package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //음량 = 100 이므로 최대음량입니다 호출.
        speaker.volumeUp();
        speaker.showVolume();


        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; //private으로 접근 제한자를 바꿨기 때문에 외부에서 접근 불가
        //speaker.showVolume();
    }
}
