package item_5;

public class MusicMain {
    public static void main(String[] args) {
        MusicPlayer jazz = new MusicPlayer(new Jazz()); // 외부에서 객체를 주입

        MusicPlayer rock = new MusicPlayer(new Rock()); // 외부에서 객체를 주입

        jazz.musicPlay();
        //재즈 시작
        rock.musicPlay();
        //락 시작
    }
}
