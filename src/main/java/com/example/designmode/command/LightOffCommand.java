package com.example.designmode.command;

/**
 * @author wangxg
 * @date 2021-05-10 11:36 上午
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
