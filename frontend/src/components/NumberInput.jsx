import React from "react";

const NumberInput = ({ label }) => (
  <div className="input-container">
    <label htmlFor="">{label}</label>
    <input type="number" className="text-control" />
  </div>
);

export default NumberInput;
