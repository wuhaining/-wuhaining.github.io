/**
*@author wuhn
*@创建时间 2015/9/9
*@修改人
*@修改时间
*@功能 公用方法
**/

/**********初始化开始***********/
$(function(){
	$('#navigation').html(navigation);
});
/**********初始化结束**********/



/**********百度分享开始**********/
window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdPic":"","bdStyle":"0","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];
/**********百度分享结束**********/

//导航栏
var navigation = '<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">'+
        '<div class="container">'+
            '<div class="navbar-header">'+
                '<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-navbar-collapse">'+
                    '<span class="sr-only">切换导航</span>'+
                    '<span class="icon-bar"></span>'+
                    '<span class="icon-bar"></span>'+
                    '<span class="icon-bar"></span>'+
                '</button>'+
                '<a class="navbar-brand" href="javascript:void(0)">'+
                	'<strong>wuhn</strong><img alt="" src="">'+
                '</a>'+
            '</div>'+
            
            '<div class="collapse navbar-collapse" id="bs-navbar-collapse">'+
                '<ul class="nav navbar-nav">'+
                    '<li class="active"><a href="../../index.html" target="_top"><span>首页</span></a></li>'+
					'<li><a href="../introduce/introduce.html"  target="_top"><span>个人简介</span></a></li>'+
                '</ul>'+
                
				
                '<ul class="nav  navbar-nav navbar-right">'+
                	'<li style="margin-top:10px;">'+
                    	'<div class="bdsharebuttonbox"><a href="#" class="bds_more" data-cmd="more"></a><a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a><a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a href="#" class="bds_renren" data-cmd="renren" title="分享到人人网"></a><a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a></div>'+

                    '</li>'+
                '</ul>'+
                
                '<ul class="nav navbar-nav navbar-right">'+
                    '<li><a href="https://github.com/wuhaining/-wuhaining.github.io" target="_blank"><span>github</span></a></li>'+
                '</ul>'+
            '</div>'+
        '</div>'+
    '</div>';


//尾部
var footer = '';