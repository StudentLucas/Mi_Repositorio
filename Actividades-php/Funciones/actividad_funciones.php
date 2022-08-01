<?php

    //Tomando el dato del POST de HTML y lo convierto en variable

    if ($_POST){

        $nombre = $_POST['nombre'];
        $edad   = $_POST['edad'];

        // Funciones con parametros ....

        function verificar_edad($nombre,$edad){
            if ($edad < 18){
                echo "$nombre eres menor de edad, no puedes votar";
            }else {
                echo "$nombre eres mayor de edad, puedes votar";
            }
        }
        
        $imprimir = verificar_edad ($nombre,$edad);

        echo $imprimir;

        /*
        Ashley: 14 años / no puede votar
        Luis Camilo: 20 años / si puede votar
        Fernando: 16 años / no puede votar
        Jorge: 22 años / si puede votar
        */
        
    }
?>