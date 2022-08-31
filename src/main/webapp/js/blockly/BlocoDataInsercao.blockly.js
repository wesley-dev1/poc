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
 * @since 31/08/2022 14:10:21
 *
 */
window.blockly.js.blockly.BlocoDataInsercao.ExecutarArgs = [];
window.blockly.js.blockly.BlocoDataInsercao.Executar = async function() {
 var item;
  //
  item = this.cronapi.dateTime.getNow();
  //
  this.cronapi.screen.changeValueOfField("COMENTARIO_POCGrid.active.dataInsercaoComentario", item);
}
