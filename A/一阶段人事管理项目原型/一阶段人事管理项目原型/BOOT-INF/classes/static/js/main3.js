layui.use(['jquery'],function(){
    var $ = layui.jquery;


    var chartDom = document.getElementById('main3');
    var myChart = echarts.init(chartDom);
    var option;
    $.ajax({
        url: "/bigShow/optionsNum",
        type: "POST",
        dataType: "JSON",
        success: function (ret) {
            if (ret.code == 0){
                console.log(ret.data);
                var arrA = ret.data[0];
                var arrB = ret.data[1];
                var arrC = ret.data[2];
                var arrD = ret.data[3];
                option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            type: 'shadow'
                        }
                    },
                    legend: {
                        top: '5%',
                        left: 'center',
                        textStyle:{//图例文字的样式
                            color:'#fff',
                            fontSize:12
                        },
                    },
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '10%',
                        containLabel: true
                    },

                    xAxis: [
                        {
                            type: 'category',
                            data: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10',
                                '11', '12', '13', '14', '15', '16', '17', '18', '19', '20',
                                '21', '22', '23', '24', '25', '26', '27', '28', '29', '30']
                        }
                    ],
                    textStyle:{//图例文字的样式
                        color:'#fff',
                        fontSize:12
                    },
                    yAxis: [
                        {
                            type: 'value'
                        }
                    ],
                    series: [
                        {
                            name: 'A',
                            type: 'bar',
                            barWidth: 15,
                            stack: 'Search Engine',
                            emphasis: {
                                focus: 'series'
                            },
                            data: arrA
                        },
                        {
                            name: 'B',
                            type: 'bar',
                            stack: 'Search Engine',
                            emphasis: {
                                focus: 'series'
                            },
                            data: arrB
                        },
                        {
                            name: 'C',
                            type: 'bar',
                            stack: 'Search Engine',
                            emphasis: {
                                focus: 'series'
                            },
                            data: arrC
                        },
                        {
                            name: 'D',
                            type: 'bar',
                            stack: 'Search Engine',
                            emphasis: {
                                focus: 'series'
                            },
                            data: arrD
                        }
                    ]
                };

                myChart.setOption(option);

            }else {
                layer.msg(ret.msg, {icon: 5});
            }
        }
    });

});



