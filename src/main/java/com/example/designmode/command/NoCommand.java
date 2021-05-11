package com.example.designmode.command;

/**
 * @author wangxg
 * @date 2021-05-10 11:01 上午
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("noCommand");
    }
}
