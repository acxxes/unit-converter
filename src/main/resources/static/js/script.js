document.addEventListener('DOMContentLoaded', () => {

    // tab switching
    const buttons = document.querySelectorAll('.tab-button');

    buttons.forEach(button => {
        button.addEventListener('click', () => {
            const targetId = button.getAttribute('data-tab');

            document.querySelectorAll('.tab-content').forEach(panel => panel.classList.remove('active'));
            buttons.forEach(btn => btn.classList.remove('active'));

            document.getElementById(targetId).classList.add('active');
            button.classList.add('active');
        });
    });

    // form validation
    const form = document.querySelector('form');
    if (form) {
        form.addEventListener('submit', (event) => {
            const lengthInput = document.querySelector('input[name="length"]');
            if (!lengthInput.value) {
                event.preventDefault();
                alert('Please enter a length to convert.');
            }
        });
    }
});