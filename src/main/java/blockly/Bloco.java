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
 * @author Wesley Miranda De Oliveira
 * @since 01/09/2022 09:59:06
 *
 */
public static Var fa_C3_A7a_algo() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf(""),
    Var.valueOf("true"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("COMENTARIO_POCGrid.active.dataInsercaoComentario"))).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("COMENTARIO_POCGrid.active.dataInsercaoComentario"), item);
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("COMENTARIO_POCGrid.active.dataUltimaAtualizacaoComentario"), item);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("COMENTARIO_POCGrid.active.autorComentario_name"),
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.name from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName())))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("COMENTARIO_POCGrid.active.autorComentario"),
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.name from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName())))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * Bloco
 *
 * @author Wesley Miranda De Oliveira
 * @since 01/09/2022 09:59:06
 *
 */
public static Var userOn() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.name from User u where u.userName = :userName"),Var.valueOf("userName",
cronapi.util.Operations.getCurrentUserName()))));
   }
 }.call();
}

}

