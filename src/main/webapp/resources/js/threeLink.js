window.onload = inits;
// 文档加载完就执行
function inits() {
    // 初始化省
    init();
    //省节点
    var tns;
    //城市节点
    var dates;
    // 对省绑定事件
    $('#type').change(getDates);
    
}




/*
*/
function getDates() {
    var province1 = this.value;

    for (var i = 0; i < tns.length; i++) {
        if ($(tns[i]).attr('name') == province1) {
            // console.log(pns[i].getElementsByTagName('city'));
            dates = $(tns[i]).children();
        }
    }

    //创建城市对象
    var dat = $('#date')[0];
    //保证不发生叠加，每次改变限定初始个数
    dat.options.length = 0;

 

    //遍历写入城市
    for (var i = 0; i < dates.length; i++) {
        // 获取名字
        var tname = dates[i].getAttribute('name');
        // 创建标签
        var node = document.createElement('option');
        // 设置文本和value值
        node.text = tname;
        node.value = tname;
        // 插入到pn下
        dat.appendChild(node);
        // pn.options.add(node);
    }
}
/*
    初始化
*/
function init() {
   
    $.ajax({
        url: '/chenran/resources/xml/Date.xml',
//        async: true,
        type: 'get',
        success: function (data) {
            tns = data.getElementsByTagName('type');
            // 创建对象方式
            // 获取省下拉列表
            var tn = $("#type")[0];
            for (var i = 0; i < tns.length; i++) {
                // 获取名字
                var tname = tns[i].getAttribute('name');
                // 创建标签
                var node = document.createElement('option');
                // 设置文本和value值
                node.text = tname;
                node.value = tname;
                // 插入到tn下
                tn.appendChild(node);
                // pn.options.add(node);
                
            } 
        },
        error:function(){
                alert('请求失败')
            }
    });
}