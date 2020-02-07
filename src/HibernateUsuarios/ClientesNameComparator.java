/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUsuarios;

import claseObjetos.Clientes;
    import java.util.Comparator;

public class ClientesNameComparator  implements Comparator<Clientes> {
    @Override
    public int compare(Clientes b1, Clientes b2) {
      return b1.getNombre().compareTo(b2.getNombre());
    }
}


