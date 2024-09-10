document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('reservaForm').addEventListener('submit', function(event) {
        event.preventDefault();

        const nome = document.getElementById('nome').value;
        const data = document.getElementById('data').value;
        const horario = document.getElementById('horario').value;
        const origem = document.getElementById('origem').value;
        const viagem = document.getElementById('destino').value;
        
    document,getElementById('mensagem').innerHTML = mensagem;
})})
