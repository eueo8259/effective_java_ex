package item_8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{
    private static final Cleaner cleaner = Cleaner.create();

    //청소가 필요한 자원, Room 을 참조해서는 안된다.
    private static class State implements Runnable{
        int numJunkPiles; //방의 쓰레기 수

        State(int numJunkPiles){
            this.numJunkPiles = numJunkPiles;
        }
        //close 메서드나 cleaner가 호출한다
        @Override
        public void run(){
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }
    //방의 상태. cleanable 과 공유한다.
    private final State state;

    //cleanable 객체. 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles){
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }
    @Override
    public void close() throws Exception {

    }
}
