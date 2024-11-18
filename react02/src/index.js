import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//https://ko.react.dev/reference/react/createElement
const hr=React.createElement('a',{href:'http://google.com'},'link');

const h1=<h1>test page</h1>;
const btn=<button onclick="console.log('test');">btn</button>;

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(btn);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
