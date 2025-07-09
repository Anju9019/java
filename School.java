class School{
static String teacherDetails[] = {"kannada teacher", "English teacher"};
public static void getTeacherDetails(){
for(String teacherDetail:teacherDetails){
System.out.println("the details of the teacher are:");
System.out.println(teacherDetail);
}
Teacher.teacherInfo();
return;
}
}