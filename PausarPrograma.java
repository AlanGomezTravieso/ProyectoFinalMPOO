/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PausarPrograma {
   public void pausa() {
      try {
         Thread.sleep(2000L);
      } catch (InterruptedException var2) {
         Logger.getLogger(TiendaMusicalF.class.getName()).log(Level.SEVERE, (String)null, var2);
      }

   }
}