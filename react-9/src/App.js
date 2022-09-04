import React from 'react'
import Message from './Message/Message'
import Registration from './FormEX/Registration'
import User from './User/User'
const App = () => {
  return (
    <div>

      <nav className='navbar navbar-dark bg-dark'>
        <a className="navbar-brand" href="#">Registration Example</a>
      </nav>
      {/*  <Message /> */}
      <Registration />
    </div>
  )
}

export default App
