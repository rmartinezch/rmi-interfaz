/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.rmi.interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Intel
 */
public interface RmiInterface extends Remote {
    public int suma(int a, int b) throws RemoteException;
    public int diferencia(int a, int b) throws RemoteException;
    public int producto(int a, int b) throws RemoteException;
    public int cociente(int a, int b) throws RemoteException;
}
