package com.hch.dao;

public interface BankDao {
    public void inMoney(int money,int userId);
    public void outMoney(int money,int userId);
}
