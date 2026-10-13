<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Enrollments</title>
</head>

<body>

<div class="container mt-4">

    <h1>Enrollments</h1>

    <g:link action="create" class="btn btn-primary mb-3">
        Create Enrollment
    </g:link>

    <table class="table table-bordered">

        <thead>
        <tr>
            <th>Student</th>
            <th>Course</th>
            <th>Grade</th>
            <th>Action</th>
        </tr>
        </thead>

        <tbody>

        <g:each in="${enrollments}" var="enrollment">

            <tr>
                <td>${enrollment.student.name}</td>
                <td>${enrollment.course.title}</td>
                <td>${enrollment.grade}</td>

                <td>
                    <g:link
                        action="delete"
                        id="${enrollment.id}"
                        class="btn btn-danger btn-sm"
                        onclick="return confirm('Are you sure you want to delete this enrollment?')">

                        Delete

                    </g:link>
                </td>
            </tr>

        </g:each>

        </tbody>

    </table>

</div>

</body>
</html>