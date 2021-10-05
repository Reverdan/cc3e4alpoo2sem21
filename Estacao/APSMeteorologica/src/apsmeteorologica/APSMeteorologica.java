package apsmeteorologica;

import Apresentacao.frmPrincipal;
import Modelo.Serial;

public class APSMeteorologica
{

    public static void main(String[] args)
    {
        Serial serial = new Serial();

        if (serial.iniciaSerial())
        {
//            frmPrincipal frmp = new frmPrincipal(null, true);
//            frmp.setVisible(true);
        }

        frmPrincipal frmp = new frmPrincipal(null, true);
        frmp.setVisible(true);

        serial.close();
        System.exit(0);
    }

}
