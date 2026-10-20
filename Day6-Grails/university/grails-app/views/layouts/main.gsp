<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <title>
        <g:layoutTitle default="University System"/>
    </title>

    <asset:link rel="icon"
                href="favicon.ico"
                type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">

            <g:link uri="/" class="navbar-brand">
                University System
            </g:link>

            <button class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#mainNavbar">

                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse"
                 id="mainNavbar">

                <ul class="navbar-nav ms-auto align-items-lg-center">

                    <li class="nav-item">
                        <g:link uri="/"
                                class="nav-link">
                            Home
                        </g:link>
                    </li>

                    <li class="nav-item">
                        <g:link controller="student"
                                action="index"
                                class="nav-link">
                            Students
                        </g:link>
                    </li>

                    <li class="nav-item">
                        <g:link controller="course"
                                action="index"
                                class="nav-link">
                            Courses
                        </g:link>
                    </li>

                    <li class="nav-item">
                        <g:link controller="enrollment"
                                action="index"
                                class="nav-link">
                            Enrollments
                        </g:link>
                    </li>

                    <sec:ifLoggedIn>

                        <li class="nav-item">
                            <span class="nav-link text-light">
                                Welcome,
                                <sec:loggedInUserInfo field="username"/>
                            </span>
                        </li>

                        <li class="nav-item ms-lg-2">
                            <form action="${createLink(uri: '/logout')}"
                                  method="POST"
                                  class="d-inline">

                                <button type="submit"
                                        class="btn btn-outline-light btn-sm">
                                    Logout
                                </button>

                            </form>
                        </li>

                    </sec:ifLoggedIn>

                </ul>

            </div>

        </div>
    </nav>
</header>


<main class="container mt-4">

    <g:layoutBody/>

</main>


<footer class="bg-dark text-white text-center mt-5 py-3">

    <div class="container">

        <p class="mb-0">
            University Management System
        </p>

    </div>

</footer>


<asset:javascript src="application.js"/>

</body>
</html>