<?php

    //Tomando el dato del POST de HTML y lo convierto en variable

    if ($_POST){

        $nombre = $_POST['nombre'];
        $compra = $_POST['compra'];

        if ($compra < 50){
            $descuento = 0.5;
            $valor_final = $compra - ($compra * $descuento);
        } else if ($compra >= 50 && $compra < 100){
            $descuento = 0.10;
            $valor_final = $compra - ($compra * $descuento);
        } else if ($compra >= 100 && $compra <= 250){
            $descuento = 0.15;
            $valor_final = $compra - ($compra * $descuento);
        } else if ($compra > 250 && $compra < 400){
            $descuento = 0.20;
            $valor_final = $compra - ($compra * $descuento);
        } else {
            $descuento = 0;
        }

        echo "Hola ". $nombre . ". Con su compra de: $". $compra . " dolars tiene el descuento de % ". $descuento ." pasaria a cobrar $". $valor_final;


    }
?>