window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoDataInsercao = window.blockly.js.blockly.BlocoDataInsercao || {};

/**
 * @function Executar
 *
 * BlocoDataInsercao
 *
 *
 * @author Wesley Miranda De Oliveira
 * @since 01/09/2022 00:11:20
 *
 */
window.blockly.js.blockly.BlocoDataInsercao.ExecutarArgs = [];
window.blockly.js.blockly.BlocoDataInsercao.Executar = async function() {
 var item;
  //
  item = this.cronapi.dateTime.getNow();
  //
  if (this.cronapi.screen.getValueOfField("COMENTARIO_POCGrid.active.dataInsercaoComentario") == null) {
    //
    this.cronapi.screen.changeValueOfField("COMENTARIO_POCGrid.active.dataInsercaoComentario", item);
  }
}
