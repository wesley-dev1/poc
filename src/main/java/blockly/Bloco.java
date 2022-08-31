package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * Bloco
 *
 * @author Wesley Miranda De Oliveira
 * @since 31/08/2022 07:59:43
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.util.Operations.getCurrentUserName();
    return item;
   }
 }.call();
}

}

