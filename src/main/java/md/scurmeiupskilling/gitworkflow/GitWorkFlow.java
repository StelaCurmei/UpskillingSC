package md.scurmeiupskilling.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Execute - git stash command in order to save the changes";
        String step2 = "Go to the main branch - git checkout master";
        String step3 = "Get the latest changes - sync with the origin/master - git fetch";
        String step4 = "Download the diffs - git pull";
        String step5 = "Create a new dedicated branch for the task - git checkout -b Branch_Name";
        String step6 = "Add code changes to implement the required task";
        String step7 = "Save the changes on local memory - git commit";
        String step8 = "Upload the changes on the cloud - git push";
        String step9 = "Go to GitHub repository";
        String step10 = "Create a new Pull Request into the origin/master branch";
        String step11 = "Invite colleagues to review the code";
        String step12 = "Merge the code";
        String step13 = "Delete the created secondary branch as it is already merged";
        String step14 = "Go to IntelliJIdea and checkout the master branch - git checkout master";
        String step15 = "Download the latest version of the origin/master - git fetch + git pull";
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
    }
}
