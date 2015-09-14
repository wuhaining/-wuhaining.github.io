/**
*@author wuhn
*@创建时间 2015/9/9
*@修改人
*@修改时间
*@功能 公用方法
**/

/**********初始化开始***********/
$(function(){
	pageLoad();
	bootstrapDatetimepicker();
	
});
/**********初始化结束**********/


/**
*@功能 局部刷新，加载页面【点击导航栏】
*@param
*@return
**/
function pageLoad(){
	$(".pageLoad").click(function(){
		//跳转页面
		var page = $(this).attr('page');
		console.log(page);
		var path = 'pages/' + page + '/' + page + '.html';
		document.getElementById("content").src = path; 

		//导航栏对应标题点亮	
		$(this).parent().parent('li').siblings().each(function(){
			$(this).removeClass('active');
			console.log('点亮成功！！！');	
		});
		$(this).parent().parent('li').addClass('active');
		
	});
}





/**
*@功能 bootstrap-datetimepicker	时间控件
*@param
*@return
**/
function bootstrapDatetimepicker(){
	$('#datetimepicker').datetimepicker({
		language: 'zh-CN',
		startView:'month',
		minView:'month',
		maxView:'month',
		todayBtn:true
	});
	$('#datetimepicker').datetimepicker();
}