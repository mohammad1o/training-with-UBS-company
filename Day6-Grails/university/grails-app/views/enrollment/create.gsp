<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Create Enrollment</title>
</head>

<body>

<div class="container mt-4">

    <h1>Create Enrollment</h1>

    <g:if test="${flash.message}">
        <div class="alert alert-warning">
            ${flash.message}
        </div>
    </g:if>

    <g:form controller="enrollment" action="save" method="POST">

        <div class="mb-3">
            <label>Student</label>

            <g:select
                name="studentId"
                from="${students}"
                optionKey="id"
                optionValue="name"
                class="form-select"
                noSelection="['':'Select Student']"
            />
        </div>

        <div class="mb-3">
            <label>Course</label>

            <g:select
                name="courseId"
                from="${courses}"
                optionKey="id"
                optionValue="title"
                class="form-select"
                noSelection="['':'Select Course']"
            />
        </div>

        <div class="mb-3">
            <label>Grade</label>

            <g:field
                name="grade"
                type="number"
                class="form-control"
            />
        </div>

        <g:submitButton
            name="save"
            value="Save Enrollment"
            class="btn btn-primary"
        />

        <g:link action="index" class="btn btn-secondary">
            Back
        </g:link>

    </g:form>

</div>

</body>
</html>