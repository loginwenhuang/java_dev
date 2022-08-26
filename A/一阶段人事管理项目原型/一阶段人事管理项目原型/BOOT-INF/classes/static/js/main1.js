layui.use(['jquery'],function(){
    var $ = layui.jquery;

    var chartDom = document.getElementById('main1');
    var myChart = echarts.init(chartDom);
    var option;
    $.ajax({
        url: "/bigShow/queryDayPeople",
        type: "POST",
        dataType: "JSON",
        success: function (ret) {
            if (ret.code == 0){
                console.log(ret.data);
                var myArray = ret.data;
                var dayArr = [];
                var numArr = [];
                for (var index = 0; index < myArray.length; index++) {
                    dayArr.push(myArray[index].myDay);
                    numArr.push(myArray[index].num);
                }
                console.log(dayArr);
                console.log(numArr);
                option = {
                    color: ['#80FFA5'],

                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            type: 'cross',
                            label: {
                                backgroundColor: '#6a7985'
                            }
                        }
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
                            boundaryGap: false,
                            data: dayArr
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
                            name: '人数',
                            type: 'line',
                            stack: 'Total',
                            smooth: true,
                            lineStyle: {
                                width: 0
                            },
                            showSymbol: false,
                            areaStyle: {
                                opacity: 0.8,
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [
                                    {
                                        offset: 0,
                                        color: 'rgba(128, 255, 165)'
                                    },
                                    {
                                        offset: 1,
                                        color: 'rgba(1, 191, 236)'
                                    }
                                ])
                            },
                            emphasis: {
                                focus: 'series'
                            },
                            data: numArr
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

