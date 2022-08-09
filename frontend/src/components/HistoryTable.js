import React from 'react';
import Table from 'react-bootstrap/Table';

class HistoryTable extends React.Component {
    render() {
        return (
            <Table striped bordered condensed hover>
                <thead>
                    <tr>
                        <th>Número</th>
                        <th>Resultado</th>
                        <th>Tempo de execução</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>5</td>
                        <td>1</td>
                        <td>8 s</td>
                    </tr>
                </tbody>
            </Table>
        );
    }
}
export default HistoryTable;