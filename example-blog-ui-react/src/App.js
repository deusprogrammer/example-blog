import React from 'react'
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom'

import Home from './components/Home'
import Blog from './components/Blog'
import Blogs from './components/Blogs'
import User from './components/User'
import Users from './components/Users'
import BlogsByUser from './components/BlogsByUser'
import CreateBlog from './components/CreateBlog'
import CreateUser from './components/CreateUser'

import logo from './logo.svg'
import './App.css'

function App() {
  return (
    <Router>
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
                <nav>
                    <span><Link to="/">Home</Link></span>
                    <span><Link to="/users">Users</Link></span>
                    <span><Link to="/blogs">Blogs</Link></span>
                    <span><Link to="/create/blog">Create Blog</Link></span>
                    <span><Link to="/create/user">Create User</Link></span>
                </nav>
            </header>
            <Switch>
                <Route path="/" exact component={Home} />
                <Route path="/create/user" exact component={CreateUser} />
                <Route path="/users" exact component={Users} />
                <Route path="/users/:user" exact component={User} />
                <Route path="/users/:user/blogs" exact component={BlogsByUser} />
                <Route path="/blogs" exact component={Blogs} />
                <Route path="/create/blog" exact component={CreateBlog} />
                <Route path="/blogs/:blogId" exact component={Blog} />
            </Switch>
        </div>
    </Router>
  );
}

export default App;
