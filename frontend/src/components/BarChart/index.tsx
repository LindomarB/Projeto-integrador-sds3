import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { despesaSucesso } from 'types/despesa';
import { round } from 'utils/formart';
import { BASE_URL } from 'utils/request';
type SeriesData = {
        name: string;
        data: number[]
    }
type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
};
const BarChart = () => {

    const [chartData, setchartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: " ",
                data: []                   
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/despesas/sucesso-por-categoria`)
            .then((response) => {
                const data = response.data as despesaSucesso[];
                const myLabels = data.map(x => x.categoriaNome);
                const mySeries = data.map(x => round(100 * x.ultima_fatura / x.media_fatura,2));//calculo realizado aqui 
                setchartData({
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "% Despesas",
                            data: mySeries                 
                        }
                    ]
                });
            })
    },[]);

    
        const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };




    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;