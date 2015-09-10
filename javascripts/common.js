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