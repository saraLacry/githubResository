$(function(){
	
	 tableManage();
    
}) 



    
    //查询功能 
 function queryManage() {
	tableManage()
}
//数据表格
function tableManage(){
	$('#compactManageT').datagrid({    
	    url:'compactselectgl',
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
	    	name:$("[name=compactNamet]").val(),
	    	compactType:$("#dectionarycodingIdt").val(),
	    	compactState:$("#compactStatusIdt").val()
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
    $('#compactManageT').datagrid({
    	toolbar: '#compactManageTabletb'
    })
}

//执行
function compactzx() {
	
	var iterable=$('#compactManageT').datagrid("getSelections")
	
	if(iterable.length!=0){
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=13&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    		    		  location.href="xxcompactexecution?id="+iterable[0].compactId
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
		  				msg:'不是已审核状态不能执行。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})
	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行执行。',
			timeout:5000,
			showType:'slide'
		});
	}
}
//变更
function compactgx() {
	
	var iterable=$('#compactManageT').datagrid("getSelections")
	
	if(iterable.length!=0){
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=14&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  
		    		  
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    		    		  location.href="compactgxxx?id="+iterable[0].compactId
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
		  				msg:'不是已执行状态不能变更。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})
	}else{
		$.messager.show({
			
			title:'我的消息',
			msg:'请选择一条数据进行变更。',
			timeout:5000,
			showType:'slide'
		});
	}
}



//转让
function compactassignment() {
	
	var iterable=$('#compactManageT').datagrid("getSelections")
	
	if(iterable.length!=0){
		
		
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=14&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    		    		  location.href="compactassignment?id="+iterable[0].compactId
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
		  				msg:'不是已执行状态不能转让。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})
	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行转让。',
			timeout:5000,
			showType:'slide'
		});
	}
}



//解除
function compactremove() {
	
	var iterable=$('#compactManageT').datagrid("getSelections")
	
	if(iterable.length!=0){
		$.ajax({
			type:"post",
		      url:"compactrcompactjudge?id=14&&compactId="+iterable[0].compactId,
		      success:function(e){
		    	  if(e==true){
		    		  
		    		  
		    		  $.ajax({
		    			  type:"post",
		    			  url:"userSelectJudge?compactId="+iterable[0].compactId,
		    			  success:function(e){
		    				  if(e==true){
		    		    		  location.href="compactremove?id="+iterable[0].compactId
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
		  				msg:'不是已执行状态不能转让。',
		  				timeout:5000,
		  				showType:'slide'
		  			    
		  			});
		  		}	
			  } 
		})
	}else{
		$.messager.show({
			title:'我的消息',
			msg:'请选择一条数据进行转让。',
			timeout:5000,
			showType:'slide'
		});
	}
}

//查看详细信息
function managexxxx() {
	var iterable=$('#compactManageT').datagrid("getSelections")
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
    
