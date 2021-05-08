import Chart from 'react-apexcharts';
const DonutChart = () => {




    const mockData = {
        series: [100.00, 250.00, 322.00, 250.33, 450.12, 800.00],
        labels: ['Agua', 'luz', 'Gas', 'Combustivel', 'Mercado', 'Aluguel']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: mockData.labels }}
            series={mockData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;