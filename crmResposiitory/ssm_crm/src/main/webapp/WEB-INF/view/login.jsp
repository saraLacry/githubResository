<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>登录</title>
<link href="css/default.css" rel="stylesheet" type="text/css" />
<!--必要样式-->
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<link href="css/demo.css" rel="stylesheet" type="text/css" />
<link href="css/loaders.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class='login'>
		<div class='login_title'>
			<span>登录</span>
		</div>
		<div class='login_fields'>
			<div class='login_fields__user'>
				<div class='icon'>
					<img alt="" src='img/user_icon_copy.png'>
				</div>
				<input id="login" name="loginId" placeholder='用户名' maxlength="16"
					type='text' autocomplete="off" />
				<div class='validation'>
					<img alt="" src='img/tick.png'>
				</div>
			</div>
			<div class='login_fields__password'>
				<div class='icon'>
					<img alt="" src='img/lock_icon_copy.png'>
				</div>
				<input id="pwd" name="passWord" placeholder='密码' maxlength="16"
					type="password" autocomplete="off">
				<div class='validation'>
					<img alt="" src='img/tick.png'>
				</div>
			</div>
			<div class='login_fields__submit'>
				<input type='button' value='登录'>
			</div>
		</div>
		<div class='success'></div>
		<div class='disclaimer'>
			<p>欢迎登陆客户关系管理系统</p>
		</div>
	</div>
	<div class='authent'>
		<div class="loader"
			style="height: 44px; width: 44px; margin-left: 28px;">
			<div class="loader-inner ball-clip-rotate-multiple">
				<div></div>
				<div></div>
				<div></div>
			</div>
		</div>
		<p>认证中...</p>
	</div>
	<div class="OverWindows"></div>
	<link href="layui/css/layui.css" rel="stylesheet" type="text/css" />
	<script src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	<script type="text/javascript" src='js/stopExecutionOnTimeout.js?t=1'></script>
	<script src="layui/layui.js" type="text/javascript"></script>
	<script src="js/Particleground.js" type="text/javascript"></script>
	<script src="js/Treatment.js" type="text/javascript"></script>
	<script src="js/jquery.mockjax.js" type="text/javascript"></script>
	<script type="text/javascript">
		var canGetCookie = 0;//是否支持存储Cookie 0 不支持 1 支持
		var ajaxmockjax = 1;//是否启用虚拟Ajax的请求响 0 不启用  1 启用
		//默认账号密码

		var truelogin = $("#login").val();
		var truepwd = $("#pwd").val();

		$(document).keypress(function(e) {
			// 回车键事件  
			if (e.which == 13) {
				$('input[type="button"]').click();
			}
		});
		//粒子背景特效
		$('body').particleground({
			dotColor : '#E8DFE8',
			lineColor : '#133b88'
		});
		$('input[name="passWord"]').focus(function() {
			$(this).attr('type', 'password');
		});
		$('input[type="text"]').focus(function() {
			$(this).prev().animate({
				'opacity' : '1'
			}, 200);
		});
		$('input[type="text"],input[type="password"]').blur(function() {
			$(this).prev().animate({
				'opacity' : '.5'
			}, 200);
		});
		$('input[name="loginId"],input[name="passWord"]').keyup(function() {
			var Len = $(this).val().length;
			if (!$(this).val() == '' && Len >= 5) {
				$(this).next().animate({
					'opacity' : '1',
					'right' : '30'
				}, 200);
			} else {
				$(this).next().animate({
					'opacity' : '0',
					'right' : '20'
				}, 200);
			}
		});
		var open = 0;
		layui.use('layer', function() {
// 			var msgalert = '请正确填入';
// 			var index = layer.alert(msgalert, {
// 				icon : 6,
// 				time : 4000,
// 				offset : 't',
// 				closeBtn : 0,
// 				title : '友情提示',
// 				btn : [],
// 				anim : 2,
// 				shade : 0
// 			});
// 			layer.style(index, {
// 				color : '#777'
// 			});

			//非空验证
			$('input[type="button"]').click(function() {
				var login = $('input[name="loginId"]').val();
				var pwd = $('input[name="passWord"]').val();
				if (login == '' || login == null) {
					ErroAlert('请输入您的账号');
				} else if (pwd == '' || pwd == null) {
					ErroAlert('请输入密码');
				} else {
					//认证中..
					fullscreen();
					$('.login').addClass('test'); //倾斜特效
					setTimeout(function() {
						$('.login').addClass('testtwo'); //平移特效
					}, 300);
					setTimeout(function() {
						$('.authent').show().animate({
							right : -320
						}, {
							easing : 'easeOutQuint',
							duration : 600,
							queue : false
						});
						$('.authent').animate({
							opacity : 1
						}, {
							duration : 200,
							queue : false
						}).addClass('visible');
					}, 500);

					if (ajaxmockjax == 1) {
						$.ajax({
							url : 'loginCheck',
							type : 'post',
							data : {
								loginId : login,
								passWord : pwd
							},
							success : function(result) {
								if (result == "" || result == null) {
									alert("用户名或密码错误!");
									location = "login";
								}else{
									location = "index";
								}
							}
						})
					}
				}
			})
		})
		var fullscreen = function() {
			elem = document.body;
			if (elem.webkitRequestFullScreen) {
				elem.webkitRequestFullScreen();
			} else if (elem.mozRequestFullScreen) {
				elem.mozRequestFullScreen();
			} else if (elem.requestFullScreen) {
				elem.requestFullscreen();
			} else {
				//浏览器不支持全屏API或已被禁用  
			}
		}
	</script>
</body>
</html>