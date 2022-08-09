import './App.css';
import MainForm from './components/MainForm';
import HistoryTable from './components/HistoryTable';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Card from 'react-bootstrap/Card';

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
        <Col>
          <Card className='cardStyling'>
            <MainForm />
          </Card>
        </Col>
        <Col>
          <Card className='cardStyling'>
            <HistoryTable />
          </Card>
        </Col>
      </Row>
    </Container>

  );
}

export default App;
