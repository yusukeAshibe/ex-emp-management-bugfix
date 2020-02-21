$(function() {
	$('#confirmationPassword').on("keyup", function() {
		check_password();
	});

	function check_password() {
		var hostUrl = 'http://localhost:8080/check_password_api/passwordcheck';
		var inputConfirmationPassword = $("#confirmationPassword").val();
		$.ajax({
			url : hostUrl,
			type : 'POST',
			dataType : 'json',
			data : {
				confirmationPassword : inputConfirmationPassword
			},
		}).done(function(data) {
			console.log(data);
			console.dir(JSON.stringify(data));
			$("#errorMessage").text(data.errorMessage);
		}).fail(function(XMLHttpRequest, textStatus, errorThrown) {
			alert("エラーが発生しました！");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus     : " + textStatus);
			console.log("errorThrown    : " + errorThrown.message);
		});
	}
});