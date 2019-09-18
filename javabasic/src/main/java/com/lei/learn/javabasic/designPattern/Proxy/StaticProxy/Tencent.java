package com.lei.learn.javabasic.designPattern.Proxy.StaticProxy;

/**
 * proxy for game
 */
public class Tencent implements Game {
    private SuperCell superCell;


    @Override
    public void playGame() {
        if (superCell == null) {
            superCell = new SuperCell();
        }
        login();
        superCell.playGame();
        logout();
    }

    private void login() {
        System.out.println("Login Game");
    }

    private void logout() {
        System.out.println("Logout Game");
    }
}
