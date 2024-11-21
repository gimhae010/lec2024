import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Main from './pages/Main';
import Intro from './pages/Intro';
import Depts from './pages/Depts';
import Frame from './pages/components/Frame';
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Frame/>}>
          <Route index element={<Main/>}/>
          <Route path='/intro' element={<Intro/>}/>
          <Route path='/dept/' element={<Depts/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
