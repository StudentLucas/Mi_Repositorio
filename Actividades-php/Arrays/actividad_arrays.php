<?php
    $GLOBALS['clave']                = $_POST['eleccion'];
    $GLOBALS['valor']                = $_POST['rutina'];
    $GLOBALS['array']                = array();

    if ($_POST){

        switch ($clave){
            case "Lunes":
                array_push($array,$valor);
                echo "<pre>";
                print_r($array);
                echo "</pre>";
                break; 
            }
        }

            /* 
            case "Martes":
                $array= array($_POST['rutina']);
                echo "<pre>";
                var_dump($_POST['eleccion'],$array) ;
                echo "</pre>";
                break; 
           
           
           
           
            case "Miercoles":
                $array= array($_POST['rutina']);
                echo "<pre>";
                var_dump($_POST['eleccion'],$array) ;
                echo "</pre>";
                break;  
            
            case "Jueves":
                $array= array($_POST['rutina']);
                echo "<pre>";
                var_dump($_POST['eleccion'],$array) ;
                echo "</pre>";
                break; 

            case "Viernes":
                $array= array($_POST['rutina']);
                echo "<pre>";
                var_dump($_POST['eleccion'],$array) ;
                echo "</pre>";
                break;  
                
            }
            
    }
    else {
        echo "no se agrego nada";
    }
    */
?>         
        
