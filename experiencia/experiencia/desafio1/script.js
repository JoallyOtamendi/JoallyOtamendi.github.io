function encriptar (){
    var texto = document.querySelector("#texto").value;
    var textoCifrado = texto.replace(/e/gi, "enter").replace(/i/gi, "imes").replace(/a/gi, "ai").replace(/o/gi, "ober").replace(/u/gi, "ufat");
    console.log(texto)
    console.log(textoCifrado)
    let salida = document.getElementById('texto-output');
    salida.value=textoCifrado;
    }


    
var boton1 = document.querySelector("#btn-encriptar"); boton1.onclick = encriptar;

function desencriptar (){ 
    var texto = document.querySelector("#texto").value; 
    var textoCifrado = texto.replace(/enter/gi, "e").replace(/imes/gi, "i").replace(/ai/gi, "a").replace(/ober/gi, "o").replace(/ufat/gi, "u"); 
    console.log(texto)
    console.log(textoCifrado)
    let salida1= document.getElementById('texto-output');
    salida1.value=textoCifrado;

}

var boton2 = document.querySelector("#btn-desencriptar"); boton2.onclick = desencriptar;

function copiar(){
    let texto = document.getElementById("texto-output");
    texto.value; 
    texto.select()
    var successful = document.execCommand('copy');
}

var boton3 = document.querySelector("#btn-copiar"); boton3.onclick = copiar;