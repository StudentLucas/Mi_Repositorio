<?php

    //Tomando el dato del POST de HTML y lo convierto en variable

    if ($_POST){

        $numero = $_POST['numero'];
        $factor = $_POST['factorial'];

        for ($i=1; $i <= $numero; $i++){
            $factor *= $i; 
        }

        echo "El factorial del numero $numero es $factor";

        /* 
        Factorial del numero 5 : 120
        Factorial del numero 10 : 3628800
        Factorial del numero 15 : 1307674368000
        Factorial del numero 20:  2432902008176640000
        */
    }
?>