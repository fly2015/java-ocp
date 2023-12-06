import java21.com.assigments.tricks.modules.course.api.ICourseFacade;
import java21.com.assigments.tricks.modules.course.creator.CourseJava;

module course.creator
{
    requires course.api;
    provides ICourseFacade with CourseJava;
}