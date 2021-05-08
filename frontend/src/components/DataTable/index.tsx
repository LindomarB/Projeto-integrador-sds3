const DataTable = () => {
    return (

        <div className="table-responsive">
    <table className="table table-striped table-sm">
        <thead>
            <tr>
                <th>Data</th>
                <th>Despesas</th>
                <th>ultima fatura</th>
                <th>media de gastos</th>
                <th>Valor total pago</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>08/05/2021</td>
                <td>energia eletrica</td>
                <td>189,00</td>
                <td>85,00</td>
                <td>15017.00</td>
            </tr>
        </tbody>
    </table>
</div>

    );
}

export default DataTable;