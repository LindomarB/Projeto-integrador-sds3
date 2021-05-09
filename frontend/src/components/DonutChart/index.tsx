import axios from 'axios';
import Chart from 'react-apexcharts';
import { DespesaSum } from 'types/despesa';
import { BASE_URL } from 'utils/request';
type ChartData = {
    labels: string[];
    series: number[];
}
const DonutChart = () => {
    //forma errada
    let chartData: ChartData ={labels:[],series:[]}
    axios.get(`http://localhost:8080/despesas/total-por-categoria`)
        .then((response) => {
            const data = response.data as DespesaSum[];
            const myLabels = data.map(x => x.categoriaNome);
            const mySeries = data.map(x => x.soma);
            chartData = { labels: myLabels, series: mySeries };
            console.log(chartData);
        });
    

    //////const mockData = {
     //   series: [100.00, 250.00, 322.00, 250.33, 450.12, 800.00],
    ///    labels: ['Agua', 'luz', 'Gas', 'Combustivel', 'Mercado', 'Aluguel']
    //}

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;