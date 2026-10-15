<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>

<body>

<div id="create-course" class="container mt-4" role="main">

    <h1>Create Course</h1>

    <g:if test="${flash.message}">
        <div class="alert alert-info">
            ${flash.message}
        </div>
    </g:if>

    <g:hasErrors bean="${this.course}">
        <div class="alert alert-danger">
            Please fix the errors below.
        </div>
    </g:hasErrors>

    <g:form resource="${this.course}"
            controller="${controllerName}"
            method="POST">

        <div class="mb-3">
            <label class="form-label">
                Title
            </label>

            <g:textField
                name="title"
                value="${course?.title}"
                class="form-control"
            />

            <g:fieldError
                bean="${course}"
                field="title"
                class="text-danger"
            />
        </div>


        <div class="mb-3">
            <label class="form-label">
                Code
            </label>

            <g:textField
                name="code"
                value="${course?.code}"
                class="form-control"
            />

            <g:fieldError
                bean="${course}"
                field="code"
                class="text-danger"
            />
        </div>


        <div class="mb-3">
            <label class="form-label">
                Credit Hours
            </label>

            <g:field
                name="creditHours"
                type="number"
                min="1"
                max="6"
                value="${course?.creditHours}"
                class="form-control"
            />

            <g:fieldError
                bean="${course}"
                field="creditHours"
                class="text-danger"
            />
        </div>


        <button class="btn btn-primary"
                type="submit">

            Create Course

        </button>

        <g:link action="index"
                class="btn btn-secondary">

            Back

        </g:link>

    </g:form>

</div>

</body>
</html>