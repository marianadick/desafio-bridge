import React from 'react';
import Table from 'react-bootstrap/Table';

class HistoryTable extends React.Component {
    constructor(props) {
        super(props);
    }

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
                        <tr><td>{i.k}</td><td>{i.result}</td><td>{i.time}</td></tr>
                    )
                    )}
                </tbody>
            </Table>
        );
    }
}
export default HistoryTable;