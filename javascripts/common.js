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
		var page = $(this).attr('page');
		$('.content').src="https://www.baidu.com/?tn=91046557_hao_pg";
		
	});
}