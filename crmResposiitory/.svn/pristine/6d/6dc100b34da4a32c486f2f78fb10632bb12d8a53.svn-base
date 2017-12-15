/**
 * 服务统计
 */
$(function(){
	contrubutionirntable();
    
}) 



    
    //查询功能 
 function query() {
	contrubutionirntable()
}
//数据表格
function contrubutionirntable(){
	$('#statisticsServiceFormTable').datagrid({    
	    url:'compactselect',
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
            {field:'compactId',title:'合同id',width:100,checkbox:true},
	        {field:'compactName',title:'合同名称',width:100},    
	        {field:'compactType',title:'合同类型',width:100},    
	        {field:'pswdictionaryvalue',title:'状态',width:100},
	        {field:'compactFinallyDate',title:'最后操作时间',width:100},
	        {field:'usernameid',title:'代处理人',width:100},
	    ]]    
	});
	//工具栏
    $('#statisticsServiceFormTable').datagrid({
    	toolbar: '#tb'
    })
}