package gof.designpattern.singleton;

public enum Settings {
    INSTANCE;
    // 유일한 INSTANCE 가 보장된다.
    // reflection 을 막는다.
    // 또한, 내부적으로 Serializable 을 implements 하고 있는데,
    // 이것은 동일한 INSTANCE 를 역직렬화하도록 구현하고 있다.

    // 단점
    // 1. 미리 만들어진다. (eager)
    // 2. 상속을 사용할 수 없다.
}
