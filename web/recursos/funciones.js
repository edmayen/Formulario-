/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *Funcion para validar los elementos requeridos (*)
 *@param (forma) type Object
 */
function validarForm(forma)
{
  /*validamos el usuario*/
  var usuario=forma.usuario;
  if(usuario.value==="" || usuario.value==="Escribir Usuario")
  {
    alert("Debe proporcionar un nombre de usuario.");
    usuario.focus();
    usuario.select();
    return false;
  }

  //validamos la Contraseña
  var password=forma.password;
  if(password.value==="" || password.value.length<3)
  {
    alert("Debe proporcionar una contraseña de al menos 3 caracteres.");
    password.focus();
    password.select();
    return false;
  }

  //validamos las tecnologias de interes
  var tecnologias=forma.tecnologia;
  var checkSeleccionado=false;
  //revisamos si se selecciono algun chechbox
  for(i=0; i<tecnologias.length; i++)
  {
    if(tecnologias[i].checked)
    {
      checkSeleccionado=true;
    }
    if(!checkSeleccionado)
    {
      alert("Debe proporcionar una tecnologia.");
      return false;
    }
  }

  //validamos el genero
  var generos=forma.genero;
  var radioSeleccionado=false;
  //revisamos si se slecciono algun radiobutton
  for(i=0;i<generos.length;i++)
  {
    if(generos[i].checked)
    {
      radioSeleccionado=true;
    }
  }
  if(!radioSeleccionado)
  {
    alert("Debe seleccionar el genero.");
    return false;
  }


  //validamos la ocupacion
  var ocupacion=forma.ocupacion;
  if(ocupacion.value==="")
  {
    alert("Debe seleccionaruna ocupación.");
    return false;
  }

  //formulario valida
  alert("Formulario valido, enviando datos.");
  return true;
}


