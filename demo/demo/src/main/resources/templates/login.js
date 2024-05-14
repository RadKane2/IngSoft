      const container = document.querySelector('.login-container');
      const emailInput = document.querySelector('.login-container input[type="text"]');
      const passwordInput = document.querySelector('.login-container input[type="password"]');
      const loginButton = document.querySelector('.login-container button');
      let url = 'http://localhost:8080'
document.addEventListener("DOMContentLoaded", function() {
    // Agregar un evento de escucha al formulario de inicio de sesión
    document.getElementById("loginForm").addEventListener("submit", function(event) {
        event.preventDefault(); // Evitar el envío del formulario por defecto

        // Obtener los valores del usuario y la contraseña del formulario
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        // Comprobar si el usuario y la contraseña son válidos (debes tener tu propia lógica de autenticación aquí)
        var usuarioValido = "usuario";
        var contrasenaValida = "contraseña";

        if (username === usuarioValido && password === contrasenaValida) {
            // Si las credenciales son válidas, redirigir a la página "index2.0.html"
            window.location.href = "index2.0.html";
        } else {
            // Si las credenciales no son válidas, mostrar un mensaje de error
            document.getElementById("error-message").innerHTML = "Usuario o contraseña incorrectos. Por favor, intenta de nuevo.";

            // Agregar clase de estilo de error al contenedor del formulario
            document.querySelector(".login-container").classList.add("error");
        }
    });
});


