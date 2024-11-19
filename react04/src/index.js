import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Main from './pages/Main';
import Intro from './pages/Intro';
import Depts from './pages/Depts';
import Frame from './pages/Frame';
import Errs from './pages/Errs';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Frame/>}>
          <Route index element={<Main/>}/>
          <Route path='/intro' element={<Intro/>}/>
          <Route path='/dept/' element={<Depts/>}/>
          <Route path='/*' element={<Errs/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
