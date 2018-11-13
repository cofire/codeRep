/**
 * 内部员工
 */
  $(function() {
            $('form').bootstrapValidator({
                message: 'This value is not valid',
                feedbackIcons: {
                    valid: 'glyphicon glyphicon-ok',
                    invalid: 'glyphicon glyphicon-remove',
                    validating: 'glyphicon glyphicon-refresh'
                },
                fields: {
                    employeeName: {
                        /*   message: '用户名验证失败', */
                        validators: {
                            notEmpty: {
                                message: '姓名不能为空'
                            }
                        }
                    },
                    employeeId: {

                        validators: {
                            notEmpty: {
                                message: '员工编号不能为空'
                            }
                        }
                    }
                }
            });

            function isNull(arg1) {
                return !arg1 && arg1 !== 0 && typeof arg1 !== "boolean" ? true : false;
            }

            $('#submit').click(function() {
                if (isNull($("#employeeName").val()) || isNull($("#employeeId").val())) {
                    return;
                }
                $.ajax({
                    type: "post",
                    url: "employeeSave",
                    data: { employeeName: $("#employeeName").val(), employeeId: $("#employeeId").val() },
                    dataType: "json",
                    success: function(data) {
                        console.log(data);
                        if (data.success == false) {
                        	$("#warnMessage").text(data.retMessage);
                        	$('#warnBtn').trigger("click");
                            return;
                        }
                        window.location.href = 'result';
                    }
                });
            });
        });