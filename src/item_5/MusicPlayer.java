package item_5;

public class MusicPlayer {
    private final Music music;

    //내부에서 생성하는 것이 아닌 Music 타입의 객체를 외부에서 받아옴
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void musicPlay(){
        this.music.play();
    }
}
