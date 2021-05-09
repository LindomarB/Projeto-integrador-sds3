import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { DespesaPage } from "types/despesa";
import { formatLocalDate } from "utils/formart";
import { BASE_URL } from "utils/request";

const DataTable = () => {
    const [activePage, setActivePage] = useState(0);

    const [page, setPage] = useState<DespesaPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });
    useEffect(() => {
        axios.get(`${BASE_URL}/despesas?page=${activePage}&size=10&sort=date,desc`)
            .then(response => {
                setPage(response.data);
            });
    }, [activePage]);


    const changePage = (index: number) => {
        setActivePage(index);
    }
    return (
        <>
            <Pagination page={page} onpageChange={changePage} />
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

                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                                <td>{item.categoria.nome}</td>
                                <td>{item.ultima_fatura}</td>
                                <td>{item.media_fatura}</td>
                                <td>{item.total.toFixed(2)}</td>
                            </tr>

                        ))}



                    </tbody>
                </table>
            </div>
        </>
    );
}

export default DataTable;