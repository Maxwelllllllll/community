function post(){
    let questionId = $("#question_id").val();
    let content = $("#comment_content").val();
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType:'application/json',
        data:JSON.stringify({
            "parentId": questionId,
            "content": content,
            "type": 1
        }),
        success: function (response){
            if(response.code == 200)
                window.location.reload();
            else {
                if (response.code == 2003) {
                    let isAccepted = confirm(response.message);
                    if(isAccepted){
                        window.open("https://github.com/login/oauth/authorize?client_id=69340279bb42400a0069&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                        window.localStorage.setItem("closable", true);
                    }
                } else
                    alert(response.message);
                console.log(response);
            }
        },
        dataType: "json"
    });
}

function selectTag(e){
    let value = e.getAttribute("data-tag");
    let previous = $("#tag").val();
    //如果已经存在该tag了就不会添加了
    if(previous.indexOf(value) == - 1){
        if(previous){
            $("#tag").val(previous + "," + value);
        }else{
            $("#tag").val(value);
        }
    }
}
function showSelectTag(){
    $("#select-tag").show();
}