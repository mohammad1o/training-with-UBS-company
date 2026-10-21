<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />

    <g:set var="entityName"
           value="${message(code: 'student.label', default: 'Student')}" />

    <title>
        <g:message code="default.show.label" args="[entityName]" />
    </title>

    <style>
        .student-hero {
            background: linear-gradient(135deg, #111827, #374151);
        }
    </style>
</head>

<body>

<div id="content" role="main" class="py-4">

    <div class="container">

        <a href="#show-student"
           class="visually-hidden-focusable"
           tabindex="-1">

            <g:message
                code="default.link.skip.label"
                default="Skip to content&hellip;"
            />

        </a>


        <nav class="navbar navbar-expand-lg bg-body-tertiary rounded-4 shadow-sm mb-4">

            <div class="container-fluid">

                <div class="navbar-nav">

                    <a class="nav-link"
                       href="${createLink(uri: '/')}">

                        <i class="bi bi-house-door me-1"></i>
                        Home

                    </a>

                    <g:link
                        class="nav-link"
                        action="index">

                        <i class="bi bi-list-ul me-1"></i>
                        Students

                    </g:link>

                    <g:link
                        class="nav-link"
                        action="create">

                        <i class="bi bi-person-plus me-1"></i>
                        New Student

                    </g:link>

                </div>

            </div>

        </nav>


        <div class="student-hero text-white rounded-4 shadow p-4 p-md-5 mb-4">

            <div class="d-flex align-items-center gap-3">

                <div class="bg-white bg-opacity-10 rounded-4 p-3">

                    <i class="bi bi-person-badge fs-1"></i>

                </div>

                <div>

                    <h1 class="fw-bold mb-1">
                        Student Details
                    </h1>

                    <p class="mb-0 text-white-50">
                        View student information and enrolled courses
                    </p>

                </div>

            </div>

        </div>


        <g:if test="${flash.message}">

            <div class="alert alert-primary d-flex align-items-center shadow-sm"
                 role="alert">

                <i class="bi bi-info-circle me-2"></i>

                <div>
                    ${flash.message}
                </div>

            </div>

        </g:if>


        <div class="card border-0 shadow-sm rounded-4 mb-4">

            <div class="card-header bg-white border-0 pt-4 px-4">

                <h4 class="fw-bold mb-0">

                    <i class="bi bi-person-lines-fill me-2"></i>
                    Student Information

                </h4>

            </div>


            <div class="card-body p-4">

                <f:display
                    bean="student"
                    listClass="container"
                    listItemClass="row mb-3"
                    labelClass="form-label col-sm-3 fw-semibold text-secondary"
                    valueClass="col-sm-9"
                />

            </div>

        </div>


        <div class="card border-0 shadow-sm rounded-4 mb-4">

            <div class="card-header bg-white border-0 pt-4 px-4">

                <h4 class="fw-bold mb-0">

                    <i class="bi bi-journal-bookmark me-2"></i>
                    Enrolled Courses

                </h4>

            </div>


            <div class="card-body p-4">

                <g:if test="${student.enrollments}">

                    <div class="row g-3">

                        <g:each in="${student.enrollments}"
                                var="enrollment">

                            <div class="col-md-6 col-lg-4">

                                <div class="card h-100 border rounded-4">

                                    <div class="card-body">

                                        <h5 class="card-title fw-semibold">

                                            <i class="bi bi-book me-1"></i>

                                            ${enrollment.course.title}

                                        </h5>

                                        <p class="card-text text-secondary mb-0">

                                            Grade:

                                            <span class="badge text-bg-primary ms-1">

                                                ${enrollment.grade ?: 'Not assigned'}

                                            </span>

                                        </p>

                                    </div>

                                </div>

                            </div>

                        </g:each>

                    </div>

                </g:if>


                <g:else>

                    <div class="alert alert-light border text-center mb-0">

                        <i class="bi bi-info-circle me-1"></i>
                        This student is not enrolled in any courses.

                    </div>

                </g:else>

            </div>

        </div>


        <div class="card border-0 shadow-sm rounded-4">

            <div class="card-header bg-white border-0 pt-4 px-4">

                <h4 class="fw-bold mb-0">

                    <i class="bi bi-gear me-2"></i>
                    Actions

                </h4>

            </div>


            <div class="card-body p-4">

                <div class="d-flex flex-wrap gap-2">

                    <g:link
                        class="btn btn-outline-primary px-4"
                        action="edit"
                        resource="${this.student}"
                        controller="${controllerName}">

                        <i class="bi bi-pencil-square me-1"></i>
                        Edit Student

                    </g:link>


                    <sec:ifAnyGranted roles="ROLE_ADMIN">

                        <g:form
                            resource="${this.student}"
                            controller="${controllerName}"
                            method="DELETE"
                            class="d-inline">

                            <button
                                type="submit"
                                class="btn btn-outline-danger px-4"
                                onclick="return confirm('${message(
                                    code: 'default.button.delete.confirm.message',
                                    default: 'Are you sure you want to delete this student?'
                                )}');">

                                <i class="bi bi-trash me-1"></i>
                                Delete Student

                            </button>

                        </g:form>

                    </sec:ifAnyGranted>

                </div>

            </div>

        </div>

    </div>

</div>

</body>
</html>