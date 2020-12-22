import React from 'react';
import '../App.css';
import { Redirect } from "react-router-dom";


class Login extends React.Component {
    state = {
        email: '',
        password: ''
    }

    handleChange = (e) => {
        const { name, value } = e.target
        this.setState({ [name]: value })
    }

    handleSubmit = (e) => {
        e.preventDefault();
        this.props.history.push('/login');

    }


    render() {
        return (
            <div className="App">
                <div className="container">
                    <h1>Ecommerce Login</h1>
                    <form get="post">
                        <ul className="flex-outer">
                            <li>
                                <label for="email">Email</label>
                                <input type='email' name='email' placeholder='Email' required onChange={this.handleChange} />
                            </li>
                            <li>
                                <label for="password">Password</label>
                                <input type='password' name='password' placeholder='Password' required onChange={this.handleChange} />
                            </li>

                            <li>
                                <button type="submit" onClick={this.handleSubmit}>Login</button>
                            </li>
                        </ul>
                    </form>
                </div>
            </div>
        )
    }
}

export default Login;
