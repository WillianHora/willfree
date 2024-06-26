const Url = 'http://localhost:8080/todos';

fetch(Url)
  .then(response => {
    if (!response.ok) {
      throw new Error('Erro ao carregar os dados da API');
    }
   
    return response.json();
  })
  .then(data => {
    console.log(data);
    })
  .catch(error => {
    console.error('Ocorreu um erro:', error);
  });
