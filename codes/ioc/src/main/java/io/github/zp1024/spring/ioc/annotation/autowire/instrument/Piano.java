package io.github.zp1024.spring.ioc.annotation.autowire.instrument;

public class Piano implements Instrument {
    public Piano() {}

    public void play() {
        System.out.println("弹奏钢琴");
    }
}
