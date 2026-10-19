package university

class UrlMappings {

    static mappings = {

    get "/api/students"(
    controller: "studentRest",
    action: "index"
)

get "/api/students/$id"(
    controller: "studentRest",
    action: "show"
)

post "/api/students"(
    controller: "studentRest",
    action: "save"
)

put "/api/students/$id"(
    controller: "studentRest",
    action: "update"
)

delete "/api/students/$id"(
    controller: "studentRest",
    action: "delete"
)

get "/api/students/$id/courses"(
    controller: "studentRest",
    action: "courses"
)
get "/api/students/$id/gpa"(
    controller: "studentRest",
    action: "gpa"
)

        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}