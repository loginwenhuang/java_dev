layui.use(['jquery'],function(){
    var $ = layui.jquery;

    var chartDom = document.getElementById('main2_2');
    var myChart = echarts.init(chartDom);
    var option;
    $.ajax({
        url: "/bigShow/queryCharacters",
        type: "POST",
        dataType: "JSON",
        success: function (ret) {
            if (ret.code == 0){
                var myArray = ret.data;
                option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            type: 'shadow'
                        }
                    },
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '10%',
                        containLabel: true
                    },
                    textStyle: {//图例文字的样式
                        color: '#fff',
                        fontSize: 12
                    },
                    xAxis: {
                        type: 'category',
                        data: ['红色性格', '黄色性格', '蓝色性格', '绿色性格']
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [
                        {
                            barWidth: '50%',
                            data: [
                                {
                                    value: myArray[0],
                                    itemStyle: {
                                        color: 'rgb(221,0,7)'
                                    }
                                },
                                {
                                    value: myArray[1],
                                    itemStyle: {
                                        color: '#e1df4b'
                                    }
                                },
                                {
                                    value: myArray[2],
                                    itemStyle: {
                                        color: '#0b8dcc'
                                    }
                                },
                                {
                                    value: myArray[3],
                                    itemStyle: {
                                        color: '#33df49'
                                    }
                                }
                            ],
                            type: 'bar'
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





