import Chart from 'react-apexcharts';
const BarChart = () => {
        const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Agua', 'luz', 'Gas', 'Combustivel', 'Mercado','Aluguel']
        },
        series: [
            {
                name: "% Despesa",
                data: [8, 20, 10, 12, 20, 30]                   
            }
        ]
    };


    return (
        <Chart
            options={{ ...options, xaxis: mockData.labels }}
            series={mockData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;