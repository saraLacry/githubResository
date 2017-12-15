/**
 * 客户流失统计
 */
$(function () {
	statiscsTable()
})
function statiscsInquire() {
	statiscsTable()
}
//数据表格
function statiscsTable(){
	$('#statiscsAwayFormTabe').datagrid({    
	    url:'runOff',
	    //自动适应浏览器
	    fitColumns:true,
	    //单选
	    singleSelect:true,
	    //显示行号
	    rownumbers:true,
	    //显示分页
	    pagination:true,
	    //定义分页的的显示的数据
	    pageList:[2,4,6,8,10,12,14,16,18,20],
	    //初始化页面大小
	    pageSize:6,
	    columns:[[    
            {field:'clienteleRunOffMonth',title:'月份',width:100,checkbox:true},
	        {field:'clienteleRunOffCount',title:'流失数量',width:100},    
	        {field:'clienteleRunOffMonth',title:'月份',width:100},    
	        {field:'clienteleRunOffWith',title:'同比',width:100},
	        {field:'clienteleRunOffChain',title:'环比',width:100},
	    ]]    
	});
    $('#statiscsAwayFormTabe').datagrid({
    	toolbar: '#statiscsAwayFormTabegb'
    })
}