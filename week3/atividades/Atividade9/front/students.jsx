import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [dados, setDados] = useState(null);
  const [error, setError] = useState(null);

  const postStudent = async () => {
    try {
      const response = await axios.post('http://localhost:8080/student', {
        age: 29,
        email: 'maria@gmail.com',
        name: 'Maria'
      });
      setDados(response.data);
      setError(null);
    } catch (error) {
      setDados(null);
      setError(error.toString());
    }
  };

  return (
    <div>
      <h1>React Front-End:</h1>
      <button onClick={postStudent}>Inserir dados</button>
      <br /><br />
      Response Data: {dados} <br /><br />
      Error: {error}
    </div>
  );
}

export default App;
