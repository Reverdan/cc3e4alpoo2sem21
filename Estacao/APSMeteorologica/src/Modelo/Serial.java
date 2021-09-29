package Modelo;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.OutputStream;

public class Serial implements SerialPortEventListener
{

    private SerialPort serialPort = null;
    private Protocolo protocolo = new Protocolo();
    private String appName;
    private BufferedReader input;
    private OutputStream output;

    private static final int TIME_OUT = 1000;
    private static int DATA_RATE = 9600;

    private String serialPortName = "COM3";

    public boolean iniciaSerial()
    {

    }

    public void sendData()
    {

    }

    public synchronized void close()
    {

    }

    @Override
    public void serialEvent(SerialPortEvent spe)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getDATA_RATE()
    {
        return DATA_RATE;
    }

    public static void setDATA_RATE(int aDATA_RATE)
    {
        DATA_RATE = aDATA_RATE;
    }

    public SerialPort getSerialPort()
    {
        return serialPort;
    }

    public void setSerialPort(SerialPort serialPort)
    {
        this.serialPort = serialPort;
    }

    public Protocolo getProtocolo()
    {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo)
    {
        this.protocolo = protocolo;
    }

    public String getAppName()
    {
        return appName;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }

    public BufferedReader getInput()
    {
        return input;
    }

    public void setInput(BufferedReader input)
    {
        this.input = input;
    }

    public OutputStream getOutput()
    {
        return output;
    }

    public void setOutput(OutputStream output)
    {
        this.output = output;
    }

    public String getSerialPortName()
    {
        return serialPortName;
    }

    public void setSerialPortName(String serialPortName)
    {
        this.serialPortName = serialPortName;
    }

}
