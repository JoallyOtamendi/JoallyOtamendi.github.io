function muestra__oculta(id, btn){
    let div = document.getElementById(id);
    let boton = document.getElementById(btn);
    if (div.style.display == "flex"){
        div.style.display = "none";
        boton.textContent="Mostrar";
    }
    else{
        div.style.display = "flex";
        boton.textContent="Ocultar";
    }
}