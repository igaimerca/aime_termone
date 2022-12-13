import React from 'react'
import './App.css'
import Button from './components/Button'
import NumberInput from './components/NumberInput'
import Select from './components/Select'

const App = () => {
  const [answer, setAnswer] = React.useState(0);
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
      <div className="calc">
        <NumberInput label="Operand 1" />
        <Select />
        <NumberInput label="Operand 2" />
      </ div>
      <Button onSubmit={handleSubmit} />
      <div className="answer">
        Solution: {answer}
      </div>
    </div >
  )
}

export default App
