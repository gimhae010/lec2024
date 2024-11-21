import React, { useContext, useEffect } from 'react'
import { Container, Nav, Navbar } from 'react-bootstrap'
import { Link, Outlet } from 'react-router-dom'
import LoginContext from './LoginContext';

function Frame() {
  const {user}=useContext(LoginContext);
  useEffect(()=>{console.log(user)},[]);
  return (
    <>
    <Navbar  bg="primary" data-bs-theme="dark">
      <Container>
        <Navbar.Brand href="#home">인제대학교</Navbar.Brand>
        <Navbar.Toggle />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href={'/'}>Home</Nav.Link>
            <Nav.Link href={'/intro'}>Intro</Nav.Link>
            <Nav.Link href={'/dept/'}>Dept</Nav.Link>
            {user.id}
            <Nav.Link href={'/login/'}>Login</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    <Container>
        <Outlet/>
    </Container>
    </>
  )
}

export default Frame