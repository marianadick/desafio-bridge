import './App.css';
import MainForm from './components/MainForm';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';

function App() {

  return (
    <Container className='containerBackground'>
      <Row>
        <header>
          <h1 className='heroTitle'>Desafio Bridge</h1>
          <p className='heroText'>Insira um número no formulário abaixo para receber o número de número de inteiros positivos n menores que k,<br></br>para os quais
            n e n + 1 têm o mesmo número de divisores positivos.</p>
        </header>
      </Row>
      <Row>
        <MainForm />
      </Row>
    </Container>

  );
}

export default App;
