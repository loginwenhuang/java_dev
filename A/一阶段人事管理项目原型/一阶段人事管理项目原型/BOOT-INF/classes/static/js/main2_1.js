layui.use(['jquery'],function(){
    var $ = layui.jquery;

    var chartDom = document.getElementById('main2_1');
    var myChart = echarts.init(chartDom);
    var option;
    $.ajax({
        url: "/bigShow/queryCharacters",
        type: "POST",
        dataType: "JSON",
        success: function (ret) {
            if (ret.code == 0){
                console.log(ret.data);
                var myArray = ret.data;
                option = {
                    tooltip: {
                        trigger: 'item'
                    },
                    legend: {
                        top: '5%',
                        left: 'center',
                        textStyle:{//图例文字的样式
                            color:'#fff',
                            fontSize:12
                        },
                    },

                    series: [
                        {
                            name: 'Access From',
                            type: 'pie',
                            radius: ['40%', '70%'],
                            avoidLabelOverlap: false,
                            itemStyle: {
                                borderRadius: 10,
                                borderWidth: 2
                            },
                            label: {
                                show: false,
                                position: 'center'
                            },
                            emphasis: {
                                label: {
                                    show: true,
                                    fontSize: '15',
                                    fontWeight: 'bold',
                                }
                            },
                            labelLine: {
                                show: false
                            },
                            data: [
                                { value: myArray[0], name: '红色性格人数', itemStyle: { color: '#ff392a' } },
                                { value: myArray[1], name: '黄性格人数', itemStyle: { color: '#faff11' } },
                                { value: myArray[2], name: '蓝色性格人数', itemStyle: { color: '#3695ff' } },
                                { value: myArray[3], name: '绿色性格人数', itemStyle: { color: '#36ff25' } }
                            ]
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



