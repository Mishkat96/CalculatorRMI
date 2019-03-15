package calculatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorRmi extends UnicastRemoteObject implements CalculatorInterface{
    public CalculatorRmi() throws RemoteException 
    {
        int a,b;
    }
    @Override
    public int add(int a , int b)throws RemoteException
    {
        return a+b;
    }
    @Override
    public int sub(int a , int b)throws RemoteException
    {
        return a-b;
    }
    @Override
    public int mul(int a , int b)throws RemoteException
    { 
        return a*b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws RemoteException
     */
    @Override
    public int div(int a , int b)throws RemoteException
    {
        return a/b;
    }
}