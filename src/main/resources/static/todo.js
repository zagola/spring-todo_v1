var deleteTask = function() {
 $(this).parent().css("background-color", "red");
 let id = $(this).parent().attr("id")
 $.ajax({
     type : "DELETE",
     url : "/delete/" + id,
     success: function (result) {
            $.getJSON("/alltodo", todo_database);
     }
 })
}

var todo_database = function(data) {
    console.log(data);

    $("#todolist").html("");

    for (let i = 0; i < data.length; i++) {
        let text = data[i]["description"]
        let id = data[i]["id"]

        $("#todolist").append(
            `<div id=\"${id}\" class=\"is-primary notification\">` +
            `    ${text}` +
            `    <button class=\"delete is-large\"></button>` +
            `</div>`);

        $("#" + id + " > button").click(deleteTask);

        console.log(data[i]);
    }
}

$.getJSON("/alltodo", todo_database);

var addDone = function(data) {
    $("#newTask").val("");
    $.getJSON("/alltodo", todo_database);
}

var addTask = function() {
     var newTask = $("#newTask").val();
     var request = {
        url: "/add",
        data: JSON.stringify({task: newTask}),
        contentType: 'application/json; charset=utf-8'
     };
     var result = $.post(request);
     result.done(addDone);
}

$(document).on('click', '#add', addTask);