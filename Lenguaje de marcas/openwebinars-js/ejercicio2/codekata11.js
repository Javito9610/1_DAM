/*ESTO ES PARA UN EVENTO RELACIONADO A UN SOLO ELEMENTO*/
document.querySelector(".test").addEventListener("click",function(event){
    event.stopPropagation();
    /*CON EL STOPPROPAGATION LO QUE TRATAMOS DE CONSEGUIR ES EVITAR QUE UN EVENTO DE UN ELEMENTO, QUE ESTE MAS ABAJO EN EL ARBOL DOM,
    SE PROPAGUE HACIA ARRIBA JERARQUICAMENTE EN DICHO DOCUMENTO DOM Y CONTAMINE O CONTAGIE A OTROS ELEMENTO QUE ESTAN POR ENCIMA JERARQUICAMENTE HABLANDO*/
    alert("click en el boton");
});
/*ESTO ES PARA TODO EL DOCUMENTO*/
document.addEventListener("contextmenu", function(event){
    event.preventDefault();
    alert("menu contextual esta intervenido");
});
/*CON ESTO SE REFIERE A LA VENTANA*/
window.addEventListener("click", function (event){
    console.log("hemos hecho clic en la ventana de la web");
});
