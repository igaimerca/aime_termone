import React from 'react'

function Form() {
  return (
    <div>
      <form className='container'>
        <div className="calc">
          <div className="input-container">
            <label htmlFor="">Operand 1</label>
            <input type="number" className="text-control" />
          </div>
          <div className='input-container'>
            <label htmlFor="">Operation</label>
            <select name="operation" id="">
              <option value="plus">+</option>
              <option value="minus">-</option>
              <option value="times">*</option>
            </select>
          </div>
          <div className="input-container">
            <label htmlFor="">Operand 2</label>
            <input type="number" className="text-control" />
          </div>
        </div>
        <button>=</button>
      </form>
    </div>
  )
}

export default Form