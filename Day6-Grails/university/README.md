## REST API Endpoints

| Method | URL | Params / Body | Response | Status Codes |
|---|---|---|---|---|
| GET | `/api/students` | `name`, `email`, `max`, `offset` | `{ total, page, data }` | 200 |
| GET | `/api/students/:id` | `id` | Student JSON | 200, 404 |
| POST | `/api/students` | `name`, `email`, `studentNumber` | Created student | 201, 422 |
| PUT | `/api/students/:id` | Student fields | Updated student | 200, 404, 422 |
| DELETE | `/api/students/:id` | `id` | No content | 204, 404 |
| GET | `/api/students/:id/courses` | `id` | Student + enrolled courses | 200, 404 |
| GET | `/api/students/:id/gpa` | `id` | `{ studentId, gpa }` | 200, 404 |
| GET | `/api/courses` | `max`, `offset` | Course list | 200 |
| GET | `/api/enrollments` | `max`, `offset` | Enrollment list | 200 |