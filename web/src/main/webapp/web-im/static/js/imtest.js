/**
 * Created by root on 16-7-26.
 */
$(function(){
    $("#regist").on('click', function() {
        var options = {
            username : 'yyyy2222',
            password : '123456',
            appKey : 'dqys#qsweb',
            success : function(result) {
                alert("注册成功！！");
            },
            error : function(e) {
                alert("注册失败！！");
            }
        };
        Easemob.im.Helper.registerUser(options);
    });
});