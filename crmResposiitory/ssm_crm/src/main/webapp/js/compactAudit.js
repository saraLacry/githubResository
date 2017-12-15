$(function(){
	 tableAudit();
    
}) 



    
    //查询功能 
 function queryAudit() {
	tableAudit()
}
//数据表格
function tableAudit(){
	$('#compactAuditTable').datagrid({    
	    url:'compactselectshh',
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
	    queryParams:{
	    	name:$("[name=compactNames]").val(),
	    	compactType:$("#dectionarycodingIds").val(),
	    	compactState:$("#compactStatusIds").val()
	    },
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
    $('#compactAuditTable').datagrid({
    	toolbar: '#ZcompactTb'
    })
}
	

//审核
function compactsh() {
	var iterable=$('#compactAuditTable').datagrid("getSelections")
	if(iterable.length!=0){
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=11&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  
		    		  
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    					  location.href="xxsh?id="+iterable[0].compactId
		    				  }else{
		    					  $.messager.show({
		    			  				title:'我的消息',
		    			  				msg:'不是审核人不能操作。',
		    			  				timeout:5000,
		    			  				showType:'slide'
		    			  			    
		    			  			});  
		    				  }
		    			  }
		    		  })
		    		  
		    		  
		  		}else{
		  			$.messager.show({
		  				title:'我的消息',
		  				msg:'不是已提交状态不能审核。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})	
	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行审核。',
			timeout:5000,
			showType:'slide'
		});
	}
	
}

//审核成功
function Coexcuss() {
		location.href="shks?text="+$("[name=compactRemarks]").val()+"&&id=13"
}
//审核失败
function Coex() {
	location.href="shks?text="+$("[name=compactRemarks]").val()+"&&id=12"
}
//查看详细信息
function aidotxxxx() {
	var iterable=$('#compactAuditTable').datagrid("getSelections")
	if(iterable.length!=0){
		location.href="xxxx?id="+iterable[0].compactId
		
	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行查看。',
			timeout:5000,
			showType:'slide'
		});
	}
	
}