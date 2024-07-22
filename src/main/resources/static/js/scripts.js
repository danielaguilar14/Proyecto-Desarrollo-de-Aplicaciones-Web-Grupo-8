/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

// scripts.js
document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('registration-form');
    const formMessages = document.getElementById('form-messages');

    form.addEventListener('submit', function (event) {
        event.preventDefault();

        // Validar el formulario
        const nombre = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;
        const telefono = document.getElementById('phone').value;

        if (!nombre || !email || !password || !telefono) {
            displayMessage('Todos los campos son obligatorios', 'error');
            return;
        }

        // Enviar el formulario al servidor
        const formData = new FormData(form);
        fetch(form.action, {
            method: 'POST',
            body: formData
        })
                .then(response => response.text())
                .then(data => {
                    displayMessage('Registro exitoso', 'success');
                    form.reset();
                })
                .catch(error => {
                    displayMessage('Ocurrió un error al registrar', 'error');
                });
    });

    function displayMessage(message, type) {
        formMessages.innerHTML = `<p class="${type}">${message}</p>`;
    }
});