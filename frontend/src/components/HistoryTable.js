import React from 'react';
import Table from 'react-bootstrap/Table';

class HistoryTable extends React.Component {
    render() {
        return (
            <Table responsive>
                <thead>
                    <tr>
                        <th>Número</th>
                        <th>Resultado</th>
                        <th>Tempo de execução</th>
                    </tr>
                </thead>
                <tbody>
                    {this.props.history.map(i => (
                        <tr><td>{i.k}</td><td>{i.result}</td><td>{i.time} ns</td></tr>
                    )
                    )}
                </tbody>
            </Table>
        );
    }
}
export default HistoryTable;