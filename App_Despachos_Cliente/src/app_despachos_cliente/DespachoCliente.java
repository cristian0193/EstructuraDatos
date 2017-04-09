package app_despachos_cliente;

import cliente_servidores.Despachos;
import cliente_servidores.DespachosHelper;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class DespachoCliente {
    
public static int opcion = 0;

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Despachos despacho = DespachosHelper.narrow(ncRef.resolve_str("Despachos"));
            
            //PROGRAMACION PARA LAS INCLUIR LOS JFRAME
            

        } catch (InvalidName e) {
            System.out.println("Error: " + e);
        } catch (NotFound e) {
            System.out.println("Error: " + e);
        } catch (CannotProceed e) {
            System.out.println("Error: " + e);
        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
            System.out.println("Error: " + e);
        }

    }
}

