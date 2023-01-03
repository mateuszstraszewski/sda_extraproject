import "./App.css";
import axios from "axios";
import React, { useState, useEffect } from "react";

const Bikes = () => {
  const [bikes, setBikes] = useState([]);

  const getAllBikes = () => {
    axios.get("http://localhost:8080/api/v1/bike/getAllBikes").then((res) => {
      console.log(res);
      setBikes(res.data);
    });
  };

  useEffect(() => {
    getAllBikes();
  }, []);

  return bikes.map((bike, index) => {
    return (
      <div key={index}>
        <h2>Brand: {bike.brand}</h2>
        <h2>Mileage: {bike.mileage}</h2>
      </div>
    );
  });
};

function App() {
  return (
    <div className="App">
      <Bikes></Bikes>
    </div>
  );
}

export default App;
