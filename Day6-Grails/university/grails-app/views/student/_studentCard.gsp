<div class="card shadow-sm mb-3">
    <div class="card-body">

        <h5 class="card-title">
            ${student.name}
        </h5>

        <p class="card-text">
            Email: ${student.email}
        </p>

        <p class="card-text">
            Student Number: ${student.studentNumber}
        </p>

        <g:link
            controller="student"
            action="show"
            id="${student.id}"
            class="btn btn-primary btn-sm">
            View Student
        </g:link>

    </div>
</div>