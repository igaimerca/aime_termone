import React from 'react'

function Select() {
  return (
    <div className='input-container'>
      <label htmlFor="">Operation</label>
      <select name="operation" id="">
        <option value="plus">+</option>
        <option value="minus">-</option>
        <option value="times">*</option>
      </select>
    </div>
  )
}

export default Select