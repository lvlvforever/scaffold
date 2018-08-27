<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>hello ${name}</h4>

<form action="/baseFile" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit">

</form>
<form action="/subfile" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit">

</form>

<input type="file" name="file" id="ajaxUploadFile">
<button id="uploadFile">ajax上传文件</button>


<script src="/rs/js/jquery-1.11.1.min.js"></script>
<script>
    $(function () {
        $('#uploadFile').on('click', function () {

            var formData = new FormData();
            formData.append('file', $('#ajaxUploadFile')[0].files[0]);
            debugger;
            $.ajax({
                url: '/baseFile',
                type: 'POST',
                data: formData,
                cache: false,
                contentType: false,
                processData: false,
            }).done(function (data) {
                alert('fileid=' + data.fileId);
            }).fail(function (e) {
                console.log(e);
            })


        })


    })
</script>
</body>
</html>