<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
    <title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>

<body>

<div id="edit-student" class="container mt-4" role="main">

    <h1>Edit Student</h1>

    <g:if test="${flash.message}">
        <div class="alert alert-info">
            ${flash.message}
        </div>
    </g:if>

    <g:hasErrors bean="${this.student}">
        <div class="alert alert-danger">
            Please fix the errors below.
        </div>
    </g:hasErrors>

    <g:form resource="${this.student}"
            controller="${controllerName}"
            method="PUT">

        <g:hiddenField
            name="version"
            value="${this.student?.version}"
        />


        <div class="mb-3">

            <label class="form-label">
                Name
            </label>

            <g:textField
                name="name"
                value="${student?.name}"
                class="form-control"
            />

            <g:fieldError
                bean="${student}"
                field="name"
                class="text-danger"
            />

        </div>


        <div class="mb-3">

            <label class="form-label">
                Email
            </label>

            <g:textField
                name="email"
                value="${student?.email}"
                class="form-control"
            />

            <g:fieldError
                bean="${student}"
                field="email"
                class="text-danger"
            />

        </div>


        <div class="mb-3">

            <label class="form-label">
                Student Number
            </label>

            <g:textField
                name="studentNumber"
                value="${student?.studentNumber}"
                class="form-control"
            />

            <g:fieldError
                bean="${student}"
                field="studentNumber"
                class="text-danger"
            />

        </div>


        <button class="btn btn-primary"
                type="submit">

            Update Student

        </button>

        <g:link action="index"
                class="btn btn-secondary">

            Back

        </g:link>

    </g:form>

</div>

</body>
</html>