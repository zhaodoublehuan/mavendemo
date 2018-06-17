function bg3() {
    var r = Math.floor(Math.random() * 256);
    var g = Math.floor(Math.random() * 256);
    var b = Math.floor(Math.random() * 256);
    return "rgb("+r+','+g+','+b+")";
}
function getProjectUrl(){
    var curWwwPath = window.document.location.href;
    var pathName =  window.document.location.pathname;
    console.log(pathName);
    var pos = curWwwPath.indexOf(pathName);
    console.log(pos);
    var localhostPaht = curWwwPath.substring(0,pos);
    console.log(localhostPaht);
    var projectName = pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    console.log(projectName);
    return localhostPaht+projectName;
}
$(function () {
    var pjUrl = getProjectUrl();
    $.ajax({
        "url":pjUrl+"/chart/getProductSum",
        "type":"POST",
        "dataType": "json",
        "data":{"type":7},
        success:function(data){
            var datasets = [];
            $.each(data,function (i,v) {
                var set = {};
                set.label=v.product.name;
                set.data=[v.price];
                set.fillColor=bg3();
                set.strokeColor=bg3();
                set.pointColor=bg3();
                set.pointStrokeColor=bg3();
                set.pointHighlightFill=bg3();
                set.pointHighlightStroke=bg3();
                datasets.push(set)
            })
            var areaChartData = {
                labels: ["产品进货报表"],
                datasets: datasets
            };
            //- BAR CHART -
            //-------------
            var barChartCanvas = $("#jinhuo").get(0).getContext("2d");
            var barChart = new Chart(barChartCanvas);
            var barChartData = areaChartData;
            barChartData.datasets[1].fillColor = "#00a65a";
            barChartData.datasets[1].strokeColor = "#00a65a";
            barChartData.datasets[1].pointColor = "#00a65a";
            var barChartOptions = {
                //Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
                scaleBeginAtZero: true,
                //Boolean - Whether grid lines are shown across the chart
                scaleShowGridLines: true,
                //String - Colour of the grid lines
                scaleGridLineColor: "rgba(0,0,0,.05)",
                //Number - Width of the grid lines
                scaleGridLineWidth: 1,
                //Boolean - Whether to show horizontal lines (except X axis)
                scaleShowHorizontalLines: true,
                //Boolean - Whether to show vertical lines (except Y axis)
                scaleShowVerticalLines: true,
                //Boolean - If there is a stroke on each bar
                barShowStroke: true,
                //Number - Pixel width of the bar stroke
                barStrokeWidth: 2,
                //Number - Spacing between each of the X value sets
                barValueSpacing: 5,
                //Number - Spacing between data sets within X values
                barDatasetSpacing: 1,
                //Boolean - whether to make the chart responsive
                responsive: true,
                maintainAspectRatio: true
            };

            barChartOptions.datasetFill = false;
            barChart.Bar(barChartData, barChartOptions);
        },
        error:function(){
            alert("系统异常，请联系系统管理员");
        }
    })
    $.ajax({
        "url":pjUrl+"/chart/getProductSum",
        "type":"POST",
        "dataType": "json",
        "data":{"type":8},
        success:function(data){
            var datasets = [];
            $.each(data,function (i,v) {
                var set = {};
                set.label=v.product.name;
                set.data=[v.price];
                set.fillColor=bg3();
                set.strokeColor=bg3();
                set.pointColor=bg3();
                set.pointStrokeColor=bg3();
                set.pointHighlightFill=bg3();
                set.pointHighlightStroke=bg3();
                datasets.push(set)
            })
            var areaChartData = {
                labels: ["产品出货报表"],
                datasets: datasets
            };
            //- BAR CHART -
            //-------------
            var barChartCanvas = $("#chuhuo").get(0).getContext("2d");
            var barChart = new Chart(barChartCanvas);
            var barChartData = areaChartData;
            barChartData.datasets[1].fillColor = "#00a65a";
            barChartData.datasets[1].strokeColor = "#00a65a";
            barChartData.datasets[1].pointColor = "#00a65a";
            var barChartOptions = {
                //Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
                scaleBeginAtZero: true,
                //Boolean - Whether grid lines are shown across the chart
                scaleShowGridLines: true,
                //String - Colour of the grid lines
                scaleGridLineColor: "rgba(0,0,0,.05)",
                //Number - Width of the grid lines
                scaleGridLineWidth: 1,
                //Boolean - Whether to show horizontal lines (except X axis)
                scaleShowHorizontalLines: true,
                //Boolean - Whether to show vertical lines (except Y axis)
                scaleShowVerticalLines: true,
                //Boolean - If there is a stroke on each bar
                barShowStroke: true,
                //Number - Pixel width of the bar stroke
                barStrokeWidth: 2,
                //Number - Spacing between each of the X value sets
                barValueSpacing: 5,
                //Number - Spacing between data sets within X values
                barDatasetSpacing: 1,
                //Boolean - whether to make the chart responsive
                responsive: true,
                maintainAspectRatio: true
            };

            barChartOptions.datasetFill = false;
            barChart.Bar(barChartData, barChartOptions);
        },
        error:function(){
            alert("系统异常，请联系系统管理员");
        }
    })
    $.ajax({
        "url":pjUrl+"/chart/getChartCount",
        "type":"POST",
        "dataType": "json",
        "data":{"type":8},
        success:function(data){
            var datasets = [];
            $.each(data,function (i,v) {
                var set = {};
                set.label=v.product.name;
                set.data=[v.number];
                set.fillColor=bg3();
                set.strokeColor=bg3();
                set.pointColor=bg3();
                set.pointStrokeColor=bg3();
                set.pointHighlightFill=bg3();
                set.pointHighlightStroke=bg3();
                datasets.push(set)
            })
            var areaChartData = {
                labels: ["产品库存报表"],
                datasets: datasets
            };
            //- BAR CHART -
            //-------------
            var barChartCanvas = $("#kucun").get(0).getContext("2d");
            var barChart = new Chart(barChartCanvas);
            var barChartData = areaChartData;
            barChartData.datasets[1].fillColor = "#00a65a";
            barChartData.datasets[1].strokeColor = "#00a65a";
            barChartData.datasets[1].pointColor = "#00a65a";
            var barChartOptions = {
                //Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
                scaleBeginAtZero: true,
                //Boolean - Whether grid lines are shown across the chart
                scaleShowGridLines: true,
                //String - Colour of the grid lines
                scaleGridLineColor: "rgba(0,0,0,.05)",
                //Number - Width of the grid lines
                scaleGridLineWidth: 1,
                //Boolean - Whether to show horizontal lines (except X axis)
                scaleShowHorizontalLines: true,
                //Boolean - Whether to show vertical lines (except Y axis)
                scaleShowVerticalLines: true,
                //Boolean - If there is a stroke on each bar
                barShowStroke: true,
                //Number - Pixel width of the bar stroke
                barStrokeWidth: 2,
                //Number - Spacing between each of the X value sets
                barValueSpacing: 5,
                //Number - Spacing between data sets within X values
                barDatasetSpacing: 1,
                //Boolean - whether to make the chart responsive
                responsive: true,
                maintainAspectRatio: true
            };

            barChartOptions.datasetFill = false;
            barChart.Bar(barChartData, barChartOptions);
        },
        error:function(){
            alert("系统异常，请联系系统管理员");
        }
    })
});
