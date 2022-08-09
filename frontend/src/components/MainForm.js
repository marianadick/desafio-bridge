import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

class MainForm extends React.Component {
    render() {
        return (
            <Form className="m-10">
                <Form.Group className="mb-3" controlId="numberInput">
                    <Form.Label>Número</Form.Label>
                    <Form.Control type="number" step="1" placeholder="Exemplo: 5" />
                    <Form.Text className="text-muted">
                        Digite um número inteiro.
                    </Form.Text>
                </Form.Group>
                <Button variant="primary" type="submit" style={{"width": "100%"}}>
                    Calcular
                </Button>
            </Form>
        );
    }
}

export default MainForm;