/**
 *  회원가입
 */

const signupInputs = document.querySelectorAll('.su-input');
const submitBtns = document.querySelectorAll('.su-submit-btn');

/** undefined 검사 */
function isEmpty(str){
	if(typeof str == "undefined" || str == null || str == ''){
		return '사용가능';
	}else{
		return str;
	}
}


/* 회원가입시 유효성 검사*/
function signupValidMsg(data) {
	let signupDataObj = JSON.parse(data);

	if (signupDataObj.code == 400) {

		alert(
			'유효성 검사 오류. \n' +
			'오류코드 : ' + isEmpty(signupDataObj.code) + '\n' +
			'오류내용 : ' +
			'\t' + 'email : ' + isEmpty(signupDataObj.data.email) + '\n' +
			'\t' + 'name : ' + isEmpty(signupDataObj.data.name) + '\n' +
			'\t' + 'username : ' + isEmpty(signupDataObj.data.username) + '\n' +
			'\t' + 'password : ' + isEmpty(signupDataObj.data.password)
		);
	}
}



/* 함수를 생성 K V 형식으로 값들을 담도록*/
function signup() {

	let signupObj = {
		email: signupInputs[0].value,
		name: signupInputs[1].value,
		username: signupInputs[2].value,
		password: signupInputs[3].value
	}

	$.ajax({
		type: "post", // AuthController에서 POST로 맞추어놨다.
		url: "/auth/signup", // AuthController와 맞추는 건가...
		data: signupObj,
		dataType: "text",  // @RestController이므로 data를 반환하는 것
		success: function(data) {
			// postMapping 인 signup메서드와 연결
			// alert(data); // alert창이 보기 불편하니까 보기편하도록 만들어준다. 위의 signupValidMsg();
			signupValidMsg(data); 
		},
		error: function() {
			alert('비동기 처리 오류.');
		}
	});
}

submitBtns[1].onclick = () => {
	signup();
}