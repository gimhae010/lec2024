import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Test from './test';
import Main from './pages/Main';
import Intro from './pages/Intro';
import Depts from './pages/Depts';
import Frame from './pages/components/Frame';
import 'bootstrap/dist/css/bootstrap.min.css';
import DeptAdd from './pages/DeptAdd';
import DeptEdit from './pages/DeptEdit';
import Dept from './pages/Dept';


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Frame/>}>
          <Route index element={<Main/>}/>
          <Route path='/intro' element={<Intro/>}/>
          <Route path='/dept/' element={<Depts/>}/>
          <Route path='/dept/add' element={<DeptAdd/>}/>
          <Route path='/dept/edit' element={<DeptEdit/>}/>
          <Route path='/dept/:deptno' element={<Dept/>}/>
          <Route path='/test' element={<Test/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
