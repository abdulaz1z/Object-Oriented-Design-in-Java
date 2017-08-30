package problem;

public class SunstituteTeacher extends Teacher {

    //this violates lsp and a way around it is to
    @Override
    public void teach() {
        // make this do nothing or if it returns something then throw a customized exception
    }
}
