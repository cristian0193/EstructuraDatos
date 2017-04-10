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
import Modelos.Filiales;

public class DespachoCliente {
    
public static int opcion = 0;
frm_despacho despacho;
public static Filiales filial;

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            Despachos despacho = DespachosHelper.narrow(ncRef.resolve_str("Despachos"));            
            
            String id_filial = filial.getId();
            
            frm_despacho despa = new frm_despacho();
            despa.setVisible(true);
            
            String nombre = despacho.consultaFiliales_id(id_filial);
            filial.setNombre(nombre);
            
            
            
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

