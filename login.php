<?php
// Verificar si se han enviado datos de inicio de sesión
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Comprobar si el usuario y la contraseña son válidos (Aquí deberías tener tu propia lógica de autenticación)
    $usuario_valido = "usuario";
    $contrasena_valida = "contraseña";

    if ($_POST['username'] === $usuario_valido && $_POST['password'] === $contrasena_valida) {
        // Si las credenciales son válidas, redirigir a la página de inicio
        header("Location: inicio.php");
        exit;
    } else {
        // Si las credenciales no son válidas, mostrar un mensaje de error
        echo "<p>Usuario o contraseña incorrectos. Por favor, intenta de nuevo.</p>";
    }
}
?>
