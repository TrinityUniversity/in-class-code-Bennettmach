console.log("Hi")

const ce = React.createElement

// function StatelessHello(props) { 
//     return ce('div', null, `Hello ${props.toWhat}`);
// }

class Hello extends React.Component {
    constructor(props) {
        super(props);
        this.state = {clickCount : 0};
    }
    render() {
        return ce('div',null,`Hello ${this.props.toWhat} - click count ${this.state.clickCount}`);
    }

    clickHandler(){
        this.setState({clickCount: this.state.clickCount + 1});
    }
}

ReactDOM.render(
    ce(Hello, {toWhat: 'World'}, null),
    document.getElementById('react-root')
);