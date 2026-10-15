<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Dashboard</title>
</head>

<body>

<div class="container mt-4">

    <h1 class="mb-4">Dashboard</h1>

    <div class="row g-4">

        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">

                    <h5 class="card-title">
                        Students
                    </h5>

                    <h2>
                        ${studentCount}
                    </h2>

                </div>
            </div>
        </div>


        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">

                    <h5 class="card-title">
                        Courses
                    </h5>

                    <h2>
                        ${courseCount}
                    </h2>

                </div>
            </div>
        </div>


        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">

                    <h5 class="card-title">
                        Enrollments
                    </h5>

                    <h2>
                        ${enrollmentCount}
                    </h2>

                </div>
            </div>
        </div>

    </div>

</div>

</body>
</html>