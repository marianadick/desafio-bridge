import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

class MainForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = { value: '' };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) { this.setState({ value: event.target.value }); }

    async handleSubmit(event) {
        event.preventDefault();

        const dados = { k: this.state.value, result: "0" };

        const requestOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json', "Access-Control-Allow-Origin":"*" },
            body: JSON.stringify(dados)
        };

        const response = await fetch('http://localhost:8080/input', requestOptions);

        const data = await response.json();

        console.log(data);

        this.setState({ value: data.result });

    }

    render() {
        return (
            <Form className="m-10" onSubmit={this.handleSubmit}>
                <Form.Group className="mb-3" controlId="numberInput">
                    <Form.Label>Número</Form.Label>
                    <Form.Control onChange={this.handleChange} name="numInput" value={this.state.value} type="number" step="1" placeholder="Exemplo: 5" />
                    <Form.Text className="text-muted">
                        Digite um número inteiro.
                    </Form.Text>
                </Form.Group>
                <Button variant="primary" type="submit" style={{ "width": "100%" }}>
                    Calcular
                </Button>
            </Form>
        );
    }
}

export default MainForm;