package com.example.designmode.command;

/**
 * @author wangxg
 * @date 2021-05-10 11:36 上午
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
