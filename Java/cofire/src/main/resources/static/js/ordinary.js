/**
 * 普通访客
 */
$(function() {

	$('form')
			.bootstrapValidator(
					{
						message : 'This value is not valid',
						feedbackIcons : {
							valid : 'glyphicon glyphicon-ok',
							invalid : 'glyphicon glyphicon-remove',
							validating : 'glyphicon glyphicon-refresh'
						},
						fields : {
							name : {
								message : '用户名验证失败',
								validators : {
									notEmpty : {
										message : '姓名不能为空'
									}
								}
							},
							gender : {
								validators : {
									notEmpty : {
										message : '性别不能为空'
									}
								}
							},
							idType : {
								validators : {
									notEmpty : {
										message : '证件类型不能为空'
									}
								}
							},
							idCard : {
								validators : {
									notEmpty : {
										message : '证件号不能为空'
									},
									callback : {
										callback : function(value, validator,
												$field) {
											var idType = $('#idType').val();
											if (idType == '0') {
												var reg = /(^\d{15}$)|(^\d{17}([0-9]|X)$)/;
												return {
													valid : reg.test(value),
													message : '身份证号码格式不正确，请输入正确的身份证号码！'
												}
											}

											if (idType == '1') {
												var reg = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;
												return {
													valid : reg.test(value),
													message : '驾驶证号码格式不正确，请输入正确的驾驶证号码！'
												}
											}

											if (idType == '2') {
												var reg = /^[\d]{3}-[\d]{2}-[\d]{4}$/;
												return {
													valid : reg.test(value),
													message : '社保证号码格式不正确，请输入正确的社保证号码！'
												}
											}

											if (idType == '3') {
												var reg = /^(P\d{7})|(G\d{8})$/;
												return {
													valid : reg.test(value),
													message : '护照号码格式不正确，请输入正确的护照号码！'
												}
											}
										}
									}
								}
							},
							phone : {
								validators : {
									notEmpty : {
										message : '手机号不能为空'
									},
									stringLength : {
										min : 11,
										max : 11,
										message : '请输入11位手机号码'
									},
									regexp : {
										regexp : /^1[3|5|8]{1}[0-9]{9}$/,
										message : '请输入正确的手机号码'
									}
								}
							},
							file : {
								validators : {
									notEmpty : {
										message : '图片不能为空'
									}
								}
							},
							agree : {
								validators : {
									notEmpty : {
										message : '请勾选按钮'
									}
								}
							}

						}
					}).on('success.form.bv', function(e) {
				// 阻止默认事件提交
				e.preventDefault();
			});

	window.onload = function() {

		var uploadBtn = document.querySelector('#upload');
		var previewImgList = document.querySelector('.preview_img_list');

		imgArr = new Array();
		uploadBtn
				.addEventListener(
						'change',
						function() {
							$(".preview_img_list").empty();
							var imgLen = this.files.length;
							document.querySelector(".preview_img_list").style.display = 'block';
							var file = this.files[0];
							var img = document.createElement("img");
							previewImgList.appendChild(img);
							var reader = new FileReader();
							reader.onload = (function(aImg) {
								return function(e) {
									aImg.src = e.target.result;
									initHW();
									imgArr.push(e.target.result);
								};
							})(img);
							reader.readAsDataURL(file);

						}, false);

	}

	// 初始化图片宽度
	// 使得图片高度一致
	function initHW() {
		var previewImgList = document.querySelector('.preview_img_list');
		var LisLen = previewImgList.length;
		if (LisLen > 1) {
			var img = Lis[0].getElementsByTagName('img')[0];

			var imgW = img.width;
			var imgH = img.height;

			for (var i = 1; i < LisLen; i++) {
				var img = previewImgList[i].getElementsByTagName('img')[0];
				img.style.width = imgW + 'px';
				img.style.height = imgH + 'px';
			}
		}

	}

	$('#defaultForm').submit(function() {
		var flag = $('#defaultForm').data("bootstrapValidator").isValid();

		var flag2 = $('#defaultForm').data("bootstrapValidator").isValid();
		if (flag2) {
			var $form = $('#defaultForm');
			// 使用Ajax提交form表单数据
			var formData = new FormData($("#defaultForm")[0]);
			$.ajax({
				type : "post",
				url : $form.attr('action'),
				data : formData,
				dataType : "json",
				contentType : false,
				processData : false,
				success : function(data) {
					if (data.success == false) {
						$("#warnMessage").text(data.retMessage);
						$('#warnBtn').trigger("click");
						return;
					}
					window.location.href = 'result';
				}
			});

		}
	});
});