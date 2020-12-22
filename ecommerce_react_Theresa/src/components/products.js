import React from 'react';
import './products.css'


class Products extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      apiData: []
    }
    this.componentDidMount = this.componentDidMount.bind(this);

  }


  render() {
    <div name="fetchButton">
      <button className="form input todo" onClick={this.componentDidMount} >Fetch</button>
    </div>

    var { isLoaded, items } = this.state;

    if (!isLoaded) {
      return <div><h1>Loading...</h1></div>


    }
    else {


      return (
        <div className="App">
          <ul>
            <div className="row">
              {items.map(item => (
                <li key={item.id}  >
                  <div className="column">
                    <img class='img' src={item.image} width="150" height="200"></img>
                    <h2> {item.title} </h2>
                    <h2 >$ {item.price}</h2>
                    <h3 >{item.category}</h3>
                  </div>
                </li>
              ))}
            </div>
          </ul>
        </div>

      )
    }

  }
  componentDidMount() {
    fetch('https://fakestoreapi.com/products')
      .then(res => res.json())
      .then(json => {
        this.setState({
          isLoaded: true,
          items: json,
        })
      })
  }

}

export default Products;
