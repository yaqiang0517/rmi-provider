package com.rmi.service;

import com.rmi.comm.Account;
import com.rmi.comm.IRmiManager;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * @ClassName RmiManagerImp
 * @Description TODO
 * @Author zhangyq
 * @Date 2019/4/3 15:27
 **/
@Service
public class RmiManagerImpl implements IRmiManager {
    @Override
    public Account getAccount() throws RemoteException {
        return new Account(1,"张三");
    }
}
