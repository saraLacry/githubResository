$(function(){
	 table();
    
}) 



    
    //查询功能 
 function query() {
	table()
}
//进行提交
function compacttj() {
	
	var iterable=$('#dg').datagrid("getSelections")
	if(iterable.length!=0){
		 $.ajax({
			  type:"post",
			  url:"userSelectJudge?compactId="+iterable[0].compactId,
			  success:function(e){
				  if(e==true){
					  $.ajax({
							type:"post",
							url:"compactUpdateState",
							data:{
								"compactid":iterable[0].compactId
							},
							success:function(e){
								if(e==true){
									
									$('#dg').datagrid("reload")
								}else{
									$.messager.show({
										title:'我的消息',
										msg:'这条数据已经提交过了。',
										timeout:5000,
										showType:'slide'
									});
								}
								
							}
						})
					  
					  
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
			msg:'请选择一条数据进行提交。',
			timeout:5000,
			showType:'slide'
		});

	}
}

//跳转到修改页面
function compactReturn(){
	var iterable=$('#dg').datagrid("getSelections")
	if(iterable.length!=0){
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=41&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    					  location.href="skipUpdatre?id="+iterable[0].compactId 
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
		  				msg:'不是订立状态不能修改。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})

	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行修改。',
			timeout:5000,
			showType:'slide'
		    
		});
	}
	
}
//数据表格
function table(){
	$('#dg').datagrid({    
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
	    queryParams:{
	    	name:$("[name=compactName]").val(),
	    	compactType:$("#dectionarycodingId").val(),
	    	compactState:$("#compactStatusId").val()
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
    $('#dg').datagrid({
    	toolbar: '#tb'
    })
}
//返回主页
function CompactTuichu() {
	
	location.href="compactRe"
}
//查看详细信息
function xxxx() {
	var iterable=$('#dg').datagrid("getSelections")
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
//增加

function create() {

		location.href="accessAdd"
		
	
}   

 