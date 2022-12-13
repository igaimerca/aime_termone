import React, { useState } from 'react'
import './App.css'
import Form from './components/Form'
import axios from 'axios'

const App = () => {
  const [answer, setAnswer] = useState(0);
  const [loading, setLoading] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);

    let url = "http://localhost:8080/api/domath/";
    let resp = await axios.post(url, {
      "operand1": 1,
      "operand2": 2,
      "operation": "+"
    })
    const data = await resp.json();
    setAnswer(data);
    setLoading(false);
  }

  return (
    <div className="container">
      <h1>Calculator</h1>
      <Form />
      <div className="answer">
        Solution: {answer}
      </div>
    </div >
  )
}

export default App
