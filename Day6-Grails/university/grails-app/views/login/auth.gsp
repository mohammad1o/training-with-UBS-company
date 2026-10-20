<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <title>UBS Intern Login</title>

    <asset:stylesheet src="application.css"/>

    <style>
        body {
            min-height: 100vh;
            margin: 0;
            background:
                radial-gradient(circle at top left, rgba(13, 110, 253, 0.18), transparent 35%),
                radial-gradient(circle at bottom right, rgba(25, 135, 84, 0.14), transparent 35%),
                #f5f7fb;
            font-family: Arial, sans-serif;
        }

        .login-shell {
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 24px;
        }

        .login-card {
            width: 100%;
            max-width: 440px;
            border: 1px solid rgba(0, 0, 0, 0.05);
            border-radius: 24px;
            background: rgba(255, 255, 255, 0.96);
            box-shadow: 0 24px 70px rgba(0, 0, 0, 0.12);
            overflow: hidden;
        }

        .login-header {
            padding: 36px 32px 18px;
            text-align: center;
        }

        .brand-badge {
            width: 70px;
            height: 70px;
            border-radius: 20px;
            background: #111827;
            color: white;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 0 auto 20px;
            font-weight: 700;
            font-size: 21px;
            letter-spacing: 1px;
            box-shadow: 0 12px 28px rgba(17, 24, 39, 0.22);
        }

        .login-title {
            font-size: 29px;
            font-weight: 700;
            color: #111827;
            margin-bottom: 10px;
        }

        .login-subtitle {
            color: #6b7280;
            margin-bottom: 0;
            line-height: 1.6;
        }

        .login-body {
            padding: 18px 32px 34px;
        }

        .form-label {
            font-weight: 600;
            color: #374151;
            margin-bottom: 8px;
        }

        .form-control {
            height: 52px;
            border-radius: 14px;
            border: 1px solid #dbe1ea;
            padding: 0 16px;
            box-shadow: none;
        }

        .form-control:focus {
            border-color: #111827;
            box-shadow: 0 0 0 4px rgba(17, 24, 39, 0.08);
        }

        .login-btn {
            height: 52px;
            border-radius: 14px;
            font-weight: 600;
            font-size: 16px;
            background: #111827;
            border: none;
            transition: all 0.2s ease;
        }

        .login-btn:hover {
            background: #000000;
            transform: translateY(-1px);
        }

        .login-footer {
            text-align: center;
            color: #9ca3af;
            font-size: 13px;
            margin-top: 24px;
        }

        .system-label {
            display: inline-block;
            margin-top: 12px;
            padding: 6px 12px;
            border-radius: 999px;
            background: #f3f4f6;
            color: #4b5563;
            font-size: 12px;
            font-weight: 600;
        }
    </style>
</head>

<body>

<div class="login-shell">

    <div class="login-card">

        <div class="login-header">

            <div class="brand-badge">
                UBS
            </div>

            <div class="login-title">
                Welcome to UBS Intern
            </div>

            <p class="login-subtitle">
                Sign in to continue your internship training portal
            </p>

            <div class="system-label">
                University Management Training System
            </div>

        </div>

        <div class="login-body">

            <g:if test="${flash.message}">
                <div class="alert alert-danger rounded-3">
                    ${flash.message}
                </div>
            </g:if>

            <form action="${postUrl ?: '/login/authenticate'}"
                  method="POST">

                <div class="mb-3">

                    <label for="username"
                           class="form-label">
                        Email address
                    </label>

                    <input type="text"
                           id="username"
                           name="username"
                           class="form-control"
                           placeholder="admin@ubs.com"
                           autocomplete="username"
                           required
                           autofocus/>

                </div>

                <div class="mb-3">

                    <label for="password"
                           class="form-label">
                        Password
                    </label>

                    <input type="password"
                           id="password"
                           name="password"
                           class="form-control"
                           placeholder="Enter your password"
                           autocomplete="current-password"
                           required/>

                </div>

                <div class="form-check mb-4">

                    <input type="checkbox"
                           class="form-check-input"
                           id="remember_me"
                           name="remember-me"/>

                    <label class="form-check-label"
                           for="remember_me">
                        Remember me
                    </label>

                </div>

                <button type="submit"
                        class="btn btn-dark login-btn w-100">
                    Sign In
                </button>

            </form>

            <div class="login-footer">
                UBS Intern Training System
            </div>

        </div>

    </div>

</div>

<asset:javascript src="application.js"/>

</body>
</html>